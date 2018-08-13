public class Diameter {
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);
        root.left.left = new TreeNode1(4);
        root.left.right = new TreeNode1(5);
        System.out.println(diameter(root));
    }

    static int height (TreeNode1 root) {
        if (root == null) {
            return  0;
        }
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);
            if (lheight > rheight) {
                return lheight + 1;
            }
            else {
                return rheight + 1;
            }
        }
    }

    static int diameter(TreeNode1 root) {
        if (root == null) {
            return 0;
        }
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);

            int ldiameter = diameter(root.left);
            int rdiameter = diameter(root.right);

            return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
        }
    }
}

class TreeNode1 {
    int value;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1(int v) {
        value = v;
    }
}

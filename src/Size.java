public class Size {
    public static void main(String[] args) {
        TreeNode5 root = new TreeNode5(1);
        root.left = new TreeNode5(2);
        root.right = new TreeNode5(3);
        root.left.left = new TreeNode5(4);
        root.left.left.right = new TreeNode5(5);
        root.left.left.left = new TreeNode5(8);
        root.left.left.left.right = new TreeNode5(9);
        root.right.left = new TreeNode5(6);
        root.right.right = new TreeNode5(7);
        root.right.right.right = new TreeNode5(11);
        System.out.println(size(root));
    }

    static int size(TreeNode5 root) {
        if (root == null) {
            return 0;
        }
        else {
            return (size(root.left) + 1 + size(root.right));
        }
    }
}

class TreeNode5 {
    int value;
    TreeNode5 left;
    TreeNode5 right;
    TreeNode5(int v) {
        value = v;
    }
}




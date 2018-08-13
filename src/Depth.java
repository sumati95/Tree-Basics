public class Depth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.left.left.right = new TreeNode(9);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(11);
        depth(root);
    }

    static int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        else {
            int ldepth = depth(root.left);
            int rdepth = depth(root.right);
            if (ldepth > rdepth) {
                return ldepth + 1;
            }
            else {
                return rdepth + 1;
            }
        }
    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int v) {
        value = v;
    }
}
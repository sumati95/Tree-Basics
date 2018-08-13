public class Ancestors {
    public static void main(String[] args) {
        TreeNode2 root = new TreeNode2(1);
        root.left = new TreeNode2(2);
        root.right = new TreeNode2(3);
        root.left.left = new TreeNode2(4);
        root.left.right = new TreeNode2(5);
        root.left.left.left = new TreeNode2(7);
        ancestor(root, 7);
    }

    static boolean ancestor(TreeNode2 root, int target) {
        if (root == null) {
            return  false;
        }
        if (root.value == target) {
            return true;
        }
        if (ancestor(root.left, target) || ancestor(root.right, target)) {
            System.out.println(root.value+ " ");
            return true;
        }
        return false;
    }
}

class TreeNode2 {
    int value;
    TreeNode2 left;
    TreeNode2 right;
    TreeNode2(int v) {
        value = v;
    }
}

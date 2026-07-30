public class BalancedBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int height(TreeNode root) {

        if (root == null)
            return 0;

        int left = height(root.left);
        if (left == -1) return -1;

        int right = height(root.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1)
            return -1;

        return Math.max(left, right) + 1;
    }

    static boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        System.out.println(isBalanced(root));
    }
}

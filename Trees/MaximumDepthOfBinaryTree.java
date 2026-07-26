public class MaximumDepthOfBinaryTree {

    static class TreeNode {

        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(maxDepth(root));
    }
}

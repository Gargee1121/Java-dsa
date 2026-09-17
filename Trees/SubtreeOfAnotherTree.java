public class SubtreeOfAnotherTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (isSameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    private static boolean isSameTree(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.val != root2.val) {
            return false;
        }

        return isSameTree(root1.left, root2.left)
                && isSameTree(root1.right, root2.right);
    }

    public static void main(String[] args) {

        /*
                Root Tree

                    3
                   / \
                  4   5
                 / \
                1   2
        */

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(4);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        /*
                SubTree

                    4
                   / \
                  1   2
        */

        TreeNode subRoot = new TreeNode(4);

        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        boolean result = isSubtree(root, subRoot);

        System.out.println("Is Subtree: " + result);
    }
}

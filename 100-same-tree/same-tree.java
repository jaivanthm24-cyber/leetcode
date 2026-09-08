/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return inorder(p, q) == 0;
    }

    public static int inorder(TreeNode root, TreeNode root1) {
        if (root == null && root1 == null) {
            return 0;
        }

        if (root == null || root1 == null) {
            return 1;
        }

        int left = inorder(root.left, root1.left);

        if (left == 1) {
            return 1;
        }

        if (root.val != root1.val) {
            return 1;
        }

        int right = inorder(root.right, root1.right);

        if (right == 1) {
            return 1;
        }

        return 0;
    }
}

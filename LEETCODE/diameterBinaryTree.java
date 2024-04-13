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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int[] max = {Integer.MIN_VALUE};
        maxDepth(root, max);
        return max[0];
    }
    public int maxDepth(TreeNode root, int[] max) {
        if(root==null){
            return 0;
        }
        int left = maxDepth(root.left, max);
        int right = maxDepth(root.right, max);
        int height = right+left;
        if(height>max[0])
        {
            max[0] = height;
        }
        return 1 + Math.max(left, right);
    }
}
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
    public boolean isValidBST(TreeNode root) {
        return traversal(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean traversal(TreeNode root, Long low, Long max){
        if(root==null){
            return true;
        }
        if(root.val>low && root.val<max){
            return true && traversal(root.right, Long.valueOf(root.val), max) && traversal(root.left, low, Long.valueOf(root.val));
            
        }
        return false;
    }
}
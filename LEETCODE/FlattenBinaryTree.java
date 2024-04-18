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
    private TreeNode prev;
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode buffer = root.right;
        prev = root;
        traversal(root.left);
        traversal(buffer);
        root.left = null;
    }
    public void traversal(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode buffer = root.right;
        prev.right = root;
        prev.left = null;
        prev = root;
        traversal(root.left);
        traversal(buffer);
    }
}
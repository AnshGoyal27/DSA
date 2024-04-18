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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        traversal(root, k, list);
        return list.getLast();
    }
    public void traversal(TreeNode root, int k, List<Integer> list){
        if(root==null){
            return;
        }
        traversal(root.left, k, list);
        if(list.size()<k){
            list.add(root.val);
        }
        else{
            return;
        }
        traversal(root.right, k, list);
    }
}
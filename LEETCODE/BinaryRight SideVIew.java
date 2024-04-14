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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root, list, 1);
        return list;
    }
    public void traversal(TreeNode root, List<Integer> list, int i){
        if(root==null){
            return;
        }
        if(list.size()<i){
            list.add(root.val);
        }
        traversal(root.right, list, i+1);
        traversal(root.left, list, i+1);
    }
}
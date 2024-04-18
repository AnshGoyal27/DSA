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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> sol = new ArrayList<>();
        iterate(root, 0, sol);
        return sol;
    }

    public void iterate(TreeNode root, int i, List<List<Integer>> sol){
        if(root==null){
            return;
        }
        if(i>=sol.size()){
            List<Integer> curr = new ArrayList<>();
            curr.add(root.val);
            sol.addFirst(curr);
        }
        else{
            sol.get(sol.size()-1-i).add(root.val);
        }
        iterate(root.left, i+1, sol);
        iterate(root.right, i+1, sol);
    }
}
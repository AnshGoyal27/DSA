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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> stack = new ArrayList<>();
        List<List<Integer>> sol = new ArrayList<>();
        if(root==null){
            return sol;
        }
        stack.add(root.val);
        if((targetSum - root.val)==0 && root.left==null && root.right==null){
            List<Integer> current = new ArrayList<>();
            for(Integer i:stack){
                current.add(i);
            }
            sol.add(current);
        }
        checkSum(root.left, targetSum - root.val, stack, sol);
        checkSum(root.right, targetSum - root.val, stack, sol);
        return sol;
    }
    public void checkSum(TreeNode root, int targetSum, List<Integer> stack, List<List<Integer>> sol){
        if(root==null){
            return;
        }
        stack.add(root.val);
        if((targetSum - root.val)==0 && root.left==null && root.right==null){
            List<Integer> current = new ArrayList<>();
            for(Integer i:stack){
                current.add(i);
            }
            sol.add(current);
        }
        checkSum(root.left, targetSum - root.val, stack, sol);
        checkSum(root.right, targetSum - root.val, stack, sol);
        stack.removeLast();
        
    }
}
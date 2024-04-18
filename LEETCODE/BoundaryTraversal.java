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
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> sol = new ArrayList<>();
        if(root==null){
            return sol;
        }
        sol.add(root.val);
        leftBoundary(root.left, sol);
        leaf(root.left, sol);
        leaf(root.right, sol);
        rightBoundary(root.right, sol);
        return sol;
    }

    public void leftBoundary(TreeNode root, List<Integer> sol){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            return;
        }
        sol.add(root.val);
        if(root.left==null){
            leftBoundary(root.right, sol);
            return;
        }
        leftBoundary(root.left, sol);
    }
    public void leaf(TreeNode root, List<Integer> sol){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            sol.add(root.val);
        }
        leaf(root.left, sol);
        leaf(root.right, sol);
    }
    public void rightBoundary(TreeNode root, List<Integer> sol){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            return;
        }
        if(root.right==null){
            rightBoundary(root.left, sol);
            sol.add(root.val);
            return;
        }
        rightBoundary(root.right, sol);
        sol.add(root.val);
    }
    
}
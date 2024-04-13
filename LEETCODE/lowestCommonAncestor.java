/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode[] sol = new TreeNode[1];
        boolean[] found = new boolean[1];
        traversal(root, p, q, sol, found);
        return sol[0];
    }
    public boolean[] traversal(TreeNode root, TreeNode p, TreeNode q, TreeNode[] sol, boolean[] found){
        if(root==null){
            boolean[] answer = {false,false};
            return answer;
        }
        boolean[] answer = {false,false};
        if(root == p){
            answer[0] = true;
        }
        if(root == q){
            answer[1] = true;
        }
        boolean[] left = traversal(root.left, p, q, sol, found);
        boolean[] right = traversal(root.right, p, q, sol, found);

        if(left[0] == true || right[0]==true){
            answer[0] = true;
        }
        if(left[1] == true || right[1]==true){
            answer[1] = true;
        }

        if(answer[0] && answer[1] && !found[0]){
            found[0] = true;
            sol[0] = root;
        }


        return answer;
    }
}

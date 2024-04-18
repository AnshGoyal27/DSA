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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            List<List<Integer>> list = new ArrayList<>();
            return list;
        }
        List<List<Integer>> sol = new ArrayList<>();
        List<TreeNode> q1 = new ArrayList<>();
        List<TreeNode> q2 = new ArrayList<>();
        List<Integer> q3 = new ArrayList<>();
        int i = 0;
        q1.add(root);
        q3.add(root.val);
        sol.add(q3);
        while((i%2==0 && !q1.isEmpty()) || (i%2!=0 && !q2.isEmpty())){
            if(i%2==0){
                q3 = new ArrayList<>();
                for(TreeNode treeNode:q1){
                    if(treeNode.right!=null){
                        q2.addFirst(treeNode.right);
                        q3.add(treeNode.right.val);
                    }
                    if(treeNode.left!=null){
                        q2.addFirst(treeNode.left);
                        q3.add(treeNode.left.val);
                    }
                }
                if(!q3.isEmpty()){
                    sol.add(q3);
                }
                q1.clear();
                i++;
            }
            else{
                q3 = new ArrayList<>();
                for(TreeNode treeNode:q2){
                    if(treeNode.left!=null){
                        q1.addFirst(treeNode.left);
                        q3.add(treeNode.left.val);
                    }
                    if(treeNode.right!=null){
                        q1.addFirst(treeNode.right);
                        q3.add(treeNode.right.val);
                    }
                }
                if(!q3.isEmpty()){
                    sol.add(q3);
                }
                q2.clear();
                i++;
            }
        }
        return sol;
    }
}
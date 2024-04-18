// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         HashMap<TreeNode,Integer> dp = new HashMap<>();
//         height(root, dp);
//         return isBalance(root, dp);
        
//     }
//     public boolean isBalance(TreeNode root, HashMap<TreeNode,Integer> dp){
//         if(root==null){
//             return true;
//         }
//         return
//         Math.abs(dp.getOrDefault(root.left, 0)-dp.getOrDefault(root.right, 0))<=1 
//         && isBalance(root.left, dp)
//         && isBalance(root.right, dp);
//     }
//     public int height(TreeNode root, HashMap<TreeNode,Integer> dp){
//         if(root==null){
//             return 0;
//         }
//         else{
//             int calcHeight = 1 + Math.max(height(root.left, dp), height(root.right, dp));
//             dp.put(root, calcHeight);
//             return calcHeight;
//         }
//     }
// }


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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }  
        boolean[] balanced = {true};
        getHeight(root, balanced);
        return balanced[0];
    }
    public int getHeight(TreeNode root, boolean[] balanced){
       if(root==null){
        return 0;
       }
       int left = getHeight(root.left,balanced);
       if(balanced[0]==false){
        return -1;
       }
       int right = getHeight(root.right,balanced);
       if(balanced[0]==false){
        return -1;
       }
       if(Math.abs(left-right)>1){
        balanced[0]=false;
       }
       return Math.max(left, right)+1;
    }
}
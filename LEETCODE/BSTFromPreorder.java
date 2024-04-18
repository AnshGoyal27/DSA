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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        int[] index = {1};
        traversal(root, Integer.MIN_VALUE, Integer.MAX_VALUE, preorder, index);
        return root;
    }
    public void traversal(TreeNode root, int low, int high, int[] preorder, int[] index){
        if(index[0]>=preorder.length){
            return;
        }
        if(preorder[index[0]]>low && preorder[index[0]]<root.val){
            root.left = new TreeNode(preorder[index[0]]);
            index[0]++;
            traversal(root.left, low, root.val, preorder, index);
        }
        if(index[0]>=preorder.length){
            return;
        }
        if(preorder[index[0]]<high && preorder[index[0]]>root.val){
            root.right = new TreeNode(preorder[index[0]]);
            index[0]++;
            traversal(root.right, root.val, high, preorder, index);
        }
    }
}
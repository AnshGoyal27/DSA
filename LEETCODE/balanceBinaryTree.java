import java.util.HashMap;


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
class balancedBinaryTree {
    HashMap<TreeNode,Integer> hashMap = new HashMap<>();
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int leftHeight;
        if(hashMap.get(root.left)==null){
            leftHeight = calculateHeight(root.left);
            hashMap.put(root.left, leftHeight);
        }
        leftHeight = hashMap.get(root.left);

        int rightHeight;
        if(hashMap.get(root.right)==null){
            rightHeight = calculateHeight(root.right);
            hashMap.put(root.right, rightHeight);
        }
        rightHeight = hashMap.get(root.right);
        boolean presentNode = Math.abs(leftHeight-rightHeight)<=1?true:false;
        return presentNode && isBalanced(root.left) && isBalanced(root.right);
    }
    public int calculateHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        else{
            return 1+Math.max(calculateHeight(root.left), calculateHeight(root.right));
        }
    }
}
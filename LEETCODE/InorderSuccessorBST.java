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
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode[] inorderS = new TreeNode[1];
        traversal(root, p, null, inorderS);
        return inorderS[0];
    }
    public void traversal(TreeNode root, TreeNode p, TreeNode last, TreeNode[] inorderS){
        if(root==null){
            return;
        }
        else if(root.val>p.val){
            traversal(root.left, p, root, inorderS);
        }
        else if(root.val<p.val){
            traversal(root.right, p, last, inorderS);
        }
        else if(root==p){
            if(root.right!=null){
                inorderS[0] = inorder(p.right);
            }
            else{
                inorderS[0] = last;
            }
        }
    }
    public TreeNode inorder(TreeNode p){
        if(p==null){
            return null;
        }
        else if(p.left==null){
            return p;
        }
        return inorder(p.left);
    }
}
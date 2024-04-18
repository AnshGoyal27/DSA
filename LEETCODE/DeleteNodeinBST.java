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
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode[] toDelete = findKey(root, key, root);
        if(toDelete[0]==root){
            root = delete(toDelete[0]);
            return root;
        }
        if(toDelete[0]==null){
            return root;
        }
        else if(toDelete[1].left==toDelete[0]){
            toDelete[1].left = delete(toDelete[0]);
        }
        else{
            toDelete[1].right = delete(toDelete[0]);
        }
        return root;
    }

    public TreeNode[] findKey(TreeNode root, int key, TreeNode prev){
        if(root==null){
            TreeNode[] arr = {null,prev};
            return arr;
        }
        if(key==root.val){
            TreeNode[] arr = {root,prev};
            return arr;
        }
        if(root.val>key){
            return findKey(root.left, key, root);
        }
        else{
            return findKey(root.right, key, root);
        }
    }

    public TreeNode delete(TreeNode root){
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            root = null;
            return root;
        }
        if(root.left==null){
            TreeNode succ = inorderSuccessor(root.right);
            root.val = succ.val;
            root.right = deleteNode(root.right, succ.val);
            return root;
        }
        else if(root.right==null){
            root = root.left;
            // root.left = delete(root.left);
            return root;
        }
        TreeNode succ = inorderSuccessor(root.right);
        root.val = succ.val;
        root.right = deleteNode(root.right, succ.val);
        return root;
    }

    public TreeNode inorderSuccessor(TreeNode root){
        if(root==null){
            return null;
        }
        if(root.left==null){
            return root;
        }
        return inorderSuccessor(root.left);
    }
}
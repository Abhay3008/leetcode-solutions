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
    public TreeNode deleteNode(TreeNode root, int val) {
        if(root==null) return root;
        if(val==root.val){
            if(root.left==null && root.right==null) return null;
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            TreeNode succ =  findSuccessor(root.right);
            root.val = succ.val;

            root.right = deleteNode(root.right,succ.val);
            return root;

        }
        if(val>root.val){
            root.right = deleteNode(root.right,val);
        }
        if(val<root.val){
            root.left = deleteNode(root.left,val);
        }
        return root;
    }

    public TreeNode findSuccessor(TreeNode root){
        
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
}
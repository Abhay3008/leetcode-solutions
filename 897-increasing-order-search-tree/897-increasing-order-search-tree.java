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
    TreeNode r = new TreeNode(2);
    TreeNode tr = r;
    public TreeNode increasingBST(TreeNode root) {
        
         trav(root);
       // tr = tr.left;
        //System.out.print(tr.val);
      //  tr.right = null;
        return r.right;
    }
    public void trav(TreeNode root){
        if(root!=null){
            trav(root.left);
        
            tr.right = new TreeNode(root.val);
            tr = tr.right;
            trav(root.right);
            
        }
    }
}
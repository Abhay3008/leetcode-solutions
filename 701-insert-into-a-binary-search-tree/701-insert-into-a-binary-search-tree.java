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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode ans = root;
        TreeNode n = new TreeNode();
        if(root==null) return new TreeNode(val);
        while(root!=null){
            n = root;
            if(val>root.val)
                root = root.right;
            else if(val<root.val)
                root = root.left;
        }
        if(val>n.val)
            n.right = new TreeNode(val);
        else
            n.left = new TreeNode(val);
        return ans;
    }
}
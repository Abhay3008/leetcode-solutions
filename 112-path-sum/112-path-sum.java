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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root!=null){
            targetSum -= root.val;
            boolean f = false;
            if(targetSum==0 && root.left==null && root.right==null)
                return true;
            else if(hasPathSum(root.left, targetSum))
                return  true;
            else if(hasPathSum(root.right, targetSum))
                return true;
            return false;
        }
        return false;
    }
}
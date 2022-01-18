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
    int min = Integer.MAX_VALUE;
    int x = -1;
    public int getMinimumDifference(TreeNode root) {
       if(root!=null){
           getMinimumDifference(root.left);
           if(x!=-1)
               min = Math.min(min, root.val-x);
           x = root.val;
           getMinimumDifference(root.right);
           return min;
           
       }
        return min;
    }
}
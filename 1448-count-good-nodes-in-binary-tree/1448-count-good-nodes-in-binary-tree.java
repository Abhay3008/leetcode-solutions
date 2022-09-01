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
    public int goodNodes(TreeNode root) {
        
        return find(root,Integer.MIN_VALUE);
    }
    public int find(TreeNode root,int max){
        if(root==null) return 0;
        int ans = 0;
        if(root.val>=max){
            ans++;
            max = root.val;
            // System.out.print(root.val);
        }
        ans+=find(root.left,max);
        ans+=find(root.right,max);
        return ans;
    }
}
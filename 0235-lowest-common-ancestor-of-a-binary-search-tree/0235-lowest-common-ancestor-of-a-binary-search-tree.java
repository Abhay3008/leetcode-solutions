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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || p.val==root.val || q.val==root.val) return root;
        int min = Math.min(p.val,q.val);
        int max = Math.max(p.val,q.val);
        if(min<=root.val && max>=root.val) return root;

        if(min<root.val) return lowestCommonAncestor(root.left,p,q);
        if(max>root.val) return lowestCommonAncestor(root.right,p,q);

        return root;
    }
}
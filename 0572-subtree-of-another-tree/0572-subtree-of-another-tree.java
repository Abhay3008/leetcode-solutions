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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(root.val == subRoot.val){
            if(isSameTree(root,subRoot)){
                return true;
            }
        }
        if(isSubtree(root.left,subRoot) == true){
            return true;
        }
        if(isSubtree(root.right,subRoot) == true){
            return true;
        }
        return false;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();
        q1.add(p);
        q2.add(q);
        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode a = q1.poll();
            TreeNode b = q2.poll();

            if(check(a,b)==false) return false;
            if(a!=null){
                q1.add(a.left);
                q1.add(a.right);
                q2.add(b.left);
                q2.add(b.right);
            }
        }
        if(!q1.isEmpty()) return false;
        if(!q2.isEmpty()) return false;

        return true;


    }
    public boolean check(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(p==null) return false;
        if(q==null) return false;

        return p.val==q.val?true:false;
    }
}
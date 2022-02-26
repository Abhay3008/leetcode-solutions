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
     List<List<Integer> > x = new ArrayList();
    public List<List<Integer>> levelOrder(TreeNode root) {
        trav(root);
        return x;
    }
    public void trav(TreeNode root) {
        if(root==null) return;
        Queue <pair> q = new LinkedList<>();
       
        q.add(new pair(0,root));
        while(!q.isEmpty()){
            pair p = q.remove();
            if(x.size()==p.lvl)
            x.add(new ArrayList<Integer>());
            
            x.get(p.lvl).add(p.node.val);
            
            if(p.node.left!=null)
            q.add(new pair(p.lvl+1, p.node.left));
            if(p.node.right!=null)
            q.add(new pair(p.lvl+1,p.node.right));
            
        }
        
    }
}
class pair{
    int lvl;
    TreeNode node;
    pair(int lvl, TreeNode node) {
        this.lvl = lvl;
        this.node = node;
    }
}
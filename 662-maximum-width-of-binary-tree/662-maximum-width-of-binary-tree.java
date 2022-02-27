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
    public int widthOfBinaryTree(TreeNode root) {
       // Pair<TreeNode,Integer> 
        Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();
        q.add(new Pair(root,0));
        
        int width=0;
        while(q.size()>0){
            int count = q.size();
            int first=0,last = 0;
            for(int i = 0;i<count;i++){
                Pair<TreeNode, Integer> p = q.poll();
                if(i==0) first = p.getValue();
                if(i==count-1) last = p.getValue();
                
                if(p.getKey().left!=null)
                    q.add(new Pair(p.getKey().left,2*(p.getValue()-1)+1));
                if(p.getKey().right!=null)
                    q.add(new Pair(p.getKey().right,2*(p.getValue()-1)+2));
            }
            
            width = Math.max(width,last - first+1);
        }
        return width;
    }
}
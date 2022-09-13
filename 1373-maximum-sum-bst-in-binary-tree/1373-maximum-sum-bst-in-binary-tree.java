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
    int max = 0;
    public int maxSumBST(TreeNode root) {
        traverse(root);
        return max;
    }
    public pair traverse(TreeNode root){
        if(root==null) return new pair(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        pair left = traverse(root.left);
        pair right = traverse(root.right);
      //  System.out.println(left.max+" "+ right.min+" "+max);
        if(left.max<root.val && right.min>root.val){
            pair p = new pair();
            p.max = Math.max(root.val,Math.max(left.max,right.max));
            p.min = Math.min(root.val,Math.min(left.min,right.min));
            p.sum = root.val + left.sum+right.sum;
            max = Math.max(p.sum,max);
            return p;
        }
        else{
            pair p = new pair();
            p.max = Integer.MAX_VALUE;
            p.min = Integer.MIN_VALUE;
            p.sum = root.val + left.sum+right.sum;
            return p;
        }
    }
    
}
class pair{
    int min;
    int max;
    int sum;
   pair(){
       
   }
    pair(int min, int max, int sum){
        this.min = min;
        this.max = max;
        this.sum = sum;
    }
    
}
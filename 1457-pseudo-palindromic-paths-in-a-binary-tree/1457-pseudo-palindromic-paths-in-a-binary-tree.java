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
    public int pseudoPalindromicPaths (TreeNode root) {
        return check(root,new int[10]);
    }
    public int check(TreeNode root, int freq[]){
        if(root==null) return 0;
        freq[root.val]++;
        if(root.left==null && root.right==null){
            int flag = 0;
            for(int i = 0;i<10;i++){
             //   System.out.print(freq[i]+" ");
                if(freq[i]%2==1){
                    flag++;
                }
            }
           // System.out.println("  "+flag);
            freq[root.val]--;
            return flag>1?0:1;
        } 
        int x = check(root.left,freq) + check(root.right,freq);
        freq[root.val]--;
        return x;
    }
}
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         return build(0,0,inorder.length,preorder,inorder);
    }
    public TreeNode build(int prestart, int instart,int inend,int[] preorder,int[] inorder){
        if(prestart>=preorder.length || instart>inend) return null;
        TreeNode node = new TreeNode(preorder[prestart]);
        
        int i = 0;
        for( i = instart;i<=inend;i++){
            if(inorder[i]==node.val) break;
        }
        node.left = build(prestart+1,instart,i-1,preorder,inorder);
        node.right = build(prestart+i-instart+1,i+1,inend,preorder,inorder);

        return node;
    }
    
}
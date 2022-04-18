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
    int ans = -1;
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ls = insert(root,new ArrayList<Integer>());
        
        return ls.get(k-1);
    }
    private ArrayList<Integer> insert(TreeNode root,ArrayList<Integer> list){
        if(root==null) return list;
        insert(root.left,list);
        list.add(root.val);
        insert(root.right,list);
        return list;
    }
}
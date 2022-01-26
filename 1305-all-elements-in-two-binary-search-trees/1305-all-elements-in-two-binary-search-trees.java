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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> r1 = new ArrayList<Integer>();
        List<Integer> r2 = new ArrayList<Integer>();
        traverse(root1, r1);
        traverse(root2, r2);
        
        int i = 0,j=0;
        List<Integer> ans = new ArrayList<Integer>();

        while(i<r1.size()&&j<r2.size()){
            if(r1.get(i)<r2.get(j)){
                ans.add(r1.get(i));
                i++;
            }
            else{
                ans.add(r2.get(j));
                j++;
            }
        }
        if(i<r1.size())
            while(i<r1.size()){
                ans.add(r1.get(i));
                i++;
            }
        if(j<r2.size())
            while(j<r2.size()){
                ans.add(r2.get(j));
                j++;
            }
        return ans;
    }
    public void traverse(TreeNode root, List<Integer> l){
        if(root!=null){
            traverse(root.left, l);
            l.add(root.val);
            traverse(root.right, l);
        }
        return;
    }
}
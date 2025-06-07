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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2;
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        if(root==null) return list;
        q1.add(root);
        while(!q1.isEmpty()){
            q2 = new LinkedList<TreeNode>(q1);
            q1.clear();

            ArrayList<Integer> temp = new ArrayList<Integer>();

            while(!q2.isEmpty()){
                TreeNode x = q2.poll();
                if(x.left!=null) q1.add(x.left);;
                if(x.right!=null)q1.add(x.right);
                temp.add(x.val);
            }
            list.add(temp);

        }
        return list;

    }
}
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
class BSTIterator {
    
    Queue<Integer> st = new LinkedList<>();
    public BSTIterator(TreeNode root) {
        traverse(root);
    }
    public void traverse(TreeNode root){
        if(root==null) return;
        traverse(root.left);
        st.add(root.val);
        traverse(root.right);
        return;
    }
    
    public int next() {
        return st.poll();
    }
    
    public boolean hasNext() {
        return st.isEmpty()==false?true:false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */

class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        find(root);
        return max;
    }
    public int find(TreeNode root){
        if(root==null) return 0;
        int l = find(root.left);
        int r = find(root.right);
        max = Math.max(max,l+r);
        return Math.max(l,r)+1;
    }
}
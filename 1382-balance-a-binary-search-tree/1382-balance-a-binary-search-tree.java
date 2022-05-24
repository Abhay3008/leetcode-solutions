class Solution {
     
    public ArrayList<Integer> inorder(TreeNode node) {
       
        ArrayList<Integer> list = new ArrayList<>();
        if(node == null) return list;
        list.addAll(inorder(node.left));
        list.add(node.val);
        list.addAll(inorder(node.right));
        
        return list;
    }
    
    public TreeNode convert(ArrayList<Integer> list, int start, int end) {
        if(start>end) return null;
        
        int mid = start + (end-start)/2;
        TreeNode curr = new TreeNode(list.get(mid));
        curr.left = convert(list, start, mid-1);
        curr.right = convert(list, mid+1, end);
        return curr;
        
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> inOrder = inorder(root);
        return convert(inOrder, 0, inOrder.size()-1);
        
    }
}

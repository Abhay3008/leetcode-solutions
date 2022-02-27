
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        q.add(root);
        int flag = 0;
        while(!q.isEmpty()){
            int count = q.size();
            List<Integer> ls = new ArrayList<>();
            for(int i = 0;i<count;i++){
                TreeNode node = q.poll();
                ls.add(node.val);
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            if(flag==1){
                Collections.reverse(ls);
                flag = 0;
            }
            else
                flag = 1;
            list.add(ls);
        }
        return list;
    }
}
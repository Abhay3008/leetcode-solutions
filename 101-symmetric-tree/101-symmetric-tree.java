
class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        ArrayList<Integer> ls = new ArrayList<>();
        while(q.isEmpty()==false){
            int count = q.size();
            for(int i = 0;i<count;i++){
                TreeNode node = q.poll();
                if(node==null) 
                    ls.add(-101);
                else{  
                    ls.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }

            }
            for(int i = 0;i<ls.size()/2;i++){
                if(ls.get(i)!=ls.get(ls.size()-i-1))
                    return false;
            }
            ls.clear();

                    }
        return true;
    }
}
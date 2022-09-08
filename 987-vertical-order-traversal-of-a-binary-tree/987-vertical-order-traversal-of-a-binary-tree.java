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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        Map<Integer,ArrayList<Integer>> map = new TreeMap<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(0,root));
        while(!q.isEmpty()){
            int n = q.size();
            Map<Integer,ArrayList<Integer>> tempmap = new TreeMap<>();
            for(int i = 0;i<n;i++){
                pair p = q.poll();
                if(tempmap.containsKey(p.key)){
                    tempmap.get(p.key).add(p.node.val);
                }
                else{
                    tempmap.put(p.key,new ArrayList<>());
                    tempmap.get(p.key).add(p.node.val);
                }
                if(p.node.left!=null)
                    q.add(new pair(p.key-1,p.node.left));
                if(p.node.right!=null)
                    q.add(new pair(p.key+1,p.node.right));
            }
            for(Map.Entry<Integer,ArrayList<Integer>> ent : tempmap.entrySet()){
                ArrayList<Integer> x = ent.getValue();
                Collections.sort(x);
                    if(map.containsKey(ent.getKey())){
                        map.get(ent.getKey()).addAll(x);
                    }
                    else{
                        map.put(ent.getKey(),new ArrayList<>());
                        map.get(ent.getKey()).addAll(x);
                }
                
            }
        }
        for(Map.Entry<Integer,ArrayList<Integer>> ent : map.entrySet()){
            // Iterator val = ent.getValue().iterator();
            ans.add(new ArrayList<Integer>());
            for (Integer value : ent.getValue()) {
                ans.get(ans.size()-1).add(value);
            }
        }
        return ans;
    }
}
class pair{
    int key;
    TreeNode node;
    pair(int key, TreeNode node){
        this.key=key;
        this.node=node;
    }
}
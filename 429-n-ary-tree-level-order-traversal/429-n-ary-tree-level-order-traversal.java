/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<Node> q = new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            ans.add(new ArrayList<Integer>());
            for(int i = 0;i<n;i++){
                Node node = q.poll();
                List<Node> child = node.children;
                ans.get(ans.size()-1).add(node.val);
                for(int j = 0;j<child.size();j++)
                    q.add(child.get(j));
            }
        }
        return ans;
    }
}
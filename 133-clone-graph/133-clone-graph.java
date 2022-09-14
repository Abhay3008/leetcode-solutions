/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node root) {
        if(root==null) return null;
        Map<Node,Node> map = new HashMap<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        map.put(root,new Node(root.val));
        while(!st.isEmpty()){
            Node node = st.pop();
            for(Node n:node.neighbors){
                if(!map.containsKey(n)){
                    map.put(n,new Node(n.val));
                    st.push(n);
                }
                map.get(node).neighbors.add(map.get(n));
            }
            
        }
        return map.get(root);
    }
}
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0;i<n;i++){
                Node n1 = q.poll();
                if(i==(n-1))
                    n1.next = null;
                else{
                    n1.next = q.peek();
                }
                if(n1.left!=null)
                    q.add(n1.left);
                if(n1.right!=null)
                    q.add(n1.right);
            }
        }
        return root;
    }
}
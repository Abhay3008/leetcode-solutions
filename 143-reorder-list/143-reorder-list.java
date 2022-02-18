/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        Queue<ListNode> q = new LinkedList<>();
        Stack<ListNode> s = new Stack<>();
        int len = length(head);
        if(len<=2) return;
        ListNode temp = head;
        for(int i = 0;i<len/2;i++){
            q.add(temp);
            temp = temp.next;
        }
        while(temp!=null){
            s.push(temp);
            temp = temp.next;
        }
        ListNode n = head;
        while(!q.isEmpty()){
            n.next = q.poll();
            n = n.next;
            n.next = s.pop();
            n = n.next;
        }
        if(!s.empty()){
              n.next = s.pop();
              n = n.next;
              }
        n.next = null;
        head = head.next;
    }
    public int length(ListNode node){
        int len = 0;
        while(node!=null){
            len++;
            node=node.next;
        }
        return len;
    }
    
}
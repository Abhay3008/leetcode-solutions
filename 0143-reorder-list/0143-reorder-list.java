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
        
        Queue<ListNode> q = new LinkedList<ListNode>();
        Stack<ListNode> st = new Stack<ListNode>();
        int len = length(head);
        if(len<=2) return;
        ListNode temp=head;
        for(int i = 0;i<len/2;i++){
            q.add(temp);
            temp = temp.next;
        }

        for(int i = len/2;i<len;i++){
            st.push(temp);
            temp = temp.next;
        }

        temp = head;
        q.poll();

        while(!st.isEmpty() && !q.isEmpty()){
            temp.next = st.pop();
            temp = temp.next;
            temp.next = q.poll();
            temp = temp.next;
        }
        while(!st.isEmpty()){
            temp.next = st.pop();
            temp = temp.next;
        }
        temp.next = null;
        

    }
    public int length(ListNode head){
        int count=0;
        while(head!=null){
            head = head.next;
            count++;
        }
        return count;
    }
}
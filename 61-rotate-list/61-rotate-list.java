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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null|| head.next==null || k==0) return head;
        int len = length(head);
        k = k%len;
        
        ListNode n2 = head;
        while(n2.next!=null){
            n2 = n2.next;
        }
        int c = 0;
        ListNode n1 = head;
        while(c!=(len-k-1)){
            c++;
            n1 = n1.next;
        }
        n2.next = head;
        head = n1.next;
        n1.next = null;
        
        return head;
    }
   public ListNode reverse(ListNode head, ListNode curr, ListNode tail,ListNode k){
        if(head!=k){
            curr.next = head.next;
            head.next = tail;
            return reverse(curr.next, curr, head,k);
            
        }
        return tail;
    }
    public int length(ListNode node){
        int c = 0;
        while(node!=null)
        {
            node = node.next;
            c++;
        }
        return c;
    }
}
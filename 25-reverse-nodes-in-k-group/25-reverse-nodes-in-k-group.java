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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        return reverse(head,k);
    }
    public ListNode reverse(ListNode n1, int k){
        if(length(n1,k)==false) return n1;
        ListNode n2 = n1.next;
        ListNode head = n1;
        int c = 1;
        while(c<k){
            n1.next = n2.next;
            n2.next = head;
            head = n2;
            n2 = n1.next;
            c++;
        }
        n1.next = reverse(n1.next,k);
        
        return head;
    }
    public Boolean length(ListNode node, int k){
        while(k>0 && node!=null){
            node = node.next;
            k--;
    }
        return k>0?false:true;
    }
}
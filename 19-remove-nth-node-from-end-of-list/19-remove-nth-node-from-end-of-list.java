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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null || head == null) return null;
        ListNode n1=head;
        ListNode n2=head.next;
        ListNode n3=head;
        for(int i = 0;i<n;i++)
            n3 = n3.next;
        if(n3==null) return n2;
        while(n3.next!=null){
            n1=n1.next;
            n2=n2.next;
            n3=n3.next;
        }
        n1.next=n2.next;
        return head;
    }
}
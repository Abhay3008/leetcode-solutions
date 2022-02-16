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
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;
       return swap(head,head.next);
    }
    public ListNode swap(ListNode n1,ListNode n2){
        if(n2==null)
            return n1;
        if(n2.next==null){
            n1.next = n2.next;
            n2.next = n1;
            return n2;
        }
        n1.next = swap(n2.next, n2.next.next);
        n2.next = n1;
        return n2;
    }
}
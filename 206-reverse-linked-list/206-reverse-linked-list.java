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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next == null) return head;
        return reverse(head.next, head, head);
    }
    public ListNode reverse(ListNode head, ListNode curr, ListNode tail){
        if(head!=null){
            curr.next = head.next;
            head.next = tail;
            return reverse(curr.next, curr, head);
            
        }
        return tail;
    }

}
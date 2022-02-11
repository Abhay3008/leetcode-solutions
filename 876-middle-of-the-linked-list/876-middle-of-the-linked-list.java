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
    public ListNode middleNode(ListNode head) {
     int n = count(head);
        for(int i = 0;i<n/2;i++)
            head=head.next;
        return head;
    }
    public int count(ListNode head){
        
        return head!=null?(1+count(head.next)):0;
    }
}
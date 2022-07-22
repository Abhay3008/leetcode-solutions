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
    public ListNode partition(ListNode head, int x) {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(0);
        ListNode n1 = node1;
        ListNode n2 = node2;
        while(head!=null){
            if(head.val<x){
                n1.next = head;
                n1 = n1.next;
            }
            else{
                n2.next = head;
                n2 = n2.next;
            }
            head = head.next;
        }
        
        n2.next = null;
        n1.next = node2.next;
        return node1.next;
    }
}
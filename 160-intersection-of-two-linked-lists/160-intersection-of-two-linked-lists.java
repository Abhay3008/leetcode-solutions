/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = length(headA), l2 = length(headB);
        while(l1>l2){
            headA= headA.next;
            l1--;
        }
        while(l2>l1){
            headB= headB.next;
            l2--;
        }
        while(headA!=headB){
            headA= headA.next;
            headB= headB.next;
        }
        return headA;
    }
    public int length(ListNode node){
        int l = 0;
        while(node!=null){
            l++;
            node = node.next;
        }
        return l;
    }
}
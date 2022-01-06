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
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      // return merge(l1, l2, )
        ListNode l = new ListNode();
        if(l1 ==null && l2 == null){
            return null;
        }
        if(l1== null){
            l.val = l2.val;
            l.next = mergeTwoLists(l1, l2.next);
            return l;
        }
        if(l2==null){
            l.val = l1.val;
            l.next = mergeTwoLists(l1.next, l2);
            return l;
        }
        if(l1.val <l2.val){
            l.val = l1.val;
            l.next = mergeTwoLists(l1.next, l2);
            return l;
        }
        else{
            l.val = l2.val;
            l.next = mergeTwoLists(l1, l2.next);
            return l;
            }
    }
}
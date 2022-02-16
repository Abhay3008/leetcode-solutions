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
        for(;headA!=null;headA=headA.next){
            ListNode n = headB;
            for(;n!=null;n=n.next){
                if(headA==n)
                    return n;
            }
        }
        return null;
    }
}
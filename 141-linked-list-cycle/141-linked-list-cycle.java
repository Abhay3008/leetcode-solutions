/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode tor= head;
       ListNode har = head;
        while(tor!=null && har!=null && har.next!=null){
            
            tor = tor.next;
            har = har.next.next;
            if(tor==har)
                return true;
            
        }
        return false;
    }
}
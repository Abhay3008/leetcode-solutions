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
        ListNode hare = head;
        ListNode tor = head;
        while(hare!=null && hare.next!=null && tor.next!=null){
            tor = tor.next;
            hare = hare.next.next;
            if(hare==tor){
                System.out.print(hare.val +" "+tor.val);
                return true;
            }
        }
        return false;
    }
}
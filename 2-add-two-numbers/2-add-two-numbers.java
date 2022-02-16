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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c = new ListNode(0);
        ListNode a = l1,b=l2,node=c;
        int carry=0;
        while(a!=null || b!=null || carry>0){
            int x = (a!=null)?a.val:0;
            int y = (b!=null)?b.val:0;
            int ans = x+y+carry;
            carry= ans/10;
            
            node.next = new ListNode(ans%10);
            node = node.next;
            if(a!=null) a = a.next;
            if(b!=null) b = b.next;
        }

        return c.next;
            
    }
}
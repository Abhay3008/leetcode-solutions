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
    public ListNode deleteMiddle(ListNode head) {
        
        
        long n = 0;
        ListNode node = head;
        while(node!=null)
        {
            node = node.next;
            n++;
        }
        n--;
        if(n<=0) return head.next;
        System.out.print(n+" ");
        if((n&1)==1)
            n = (n+1)/2;
        else
            n/=2;
        System.out.print(n);
        ListNode l = head;
        ListNode r = head.next.next;
        int c = 1;
        while(r!=null){
            if(c==n){
                l.next = r;
                return head;
            }
            l = l.next;
            r = r.next;
            c++;
        }
        if(r==null)
            l.next = r;
        return head;
    }
}
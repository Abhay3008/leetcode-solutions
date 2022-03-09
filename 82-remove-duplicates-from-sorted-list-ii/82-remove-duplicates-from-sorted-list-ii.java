/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * 
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode ans = new ListNode(0,head);
        ListNode n1 = ans;
        ListNode n2 = head;
        while(n2!=null){
            if(n2.next!=null && n2.val==n2.next.val){
                while(n2.next!=null && n2.val==n2.next.val)
                    n2=n2.next;
                n1.next = n2.next;
            }
            else{
                n1=n1.next;
            }
            n2 = n2.next;
        }
        
        return ans.next;
    }
}
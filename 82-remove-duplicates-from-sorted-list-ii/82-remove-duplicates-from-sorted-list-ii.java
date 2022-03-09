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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode n1 = head;
        ListNode n2 = n1.next;
        while(n2!=null){
            if(n1.val==n2.val){
                while(n2!=null && n2.val==n1.val)
                    n2=n2.next;
                if(n2==null){n1.val = 101; continue;}
                n1.val = n2.val;
                n1.next = n2.next;
                n2=n2.next;
            }
            else{
                n1=n1.next;
                n2=n2.next;
            }
        }
        if(head.val==101) return null;
        n1 = head;
        n2=head.next;
        while(n2!=null){
            if(n2.val==101){
                n1.next=null;
                break;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return head;
    }
}
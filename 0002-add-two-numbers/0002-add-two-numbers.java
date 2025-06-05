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
        
        int carry=0;
        ListNode res=new ListNode();
        ListNode t = res;
        while(l1!=null && l2!=null){
            int a = l1.val;
            int b = l2.val;
            int c = a+b+carry;
            int ans = c%10;
            carry=c/10;
            t.next = new ListNode(ans);
            t = t.next;
            l1=l1.next;
            l2=l2.next;
            // System.out.println(t.val);
        }
        while(l1!=null){
            int a = l1.val;
            int b = a+carry;
            int ans = b%10;
            carry=b/10;
            t.next = new ListNode(ans);
            t = t.next;
            l1 = l1.next;
            System.out.println(t.val);
        }
        while(l2!=null){
            int a = l2.val;
            int b = a+carry;
            int ans = b%10;
            carry=b/10;
            t.next = new ListNode(ans);
            t = t.next;
            l2 = l2.next;
            System.out.println(t.val);
        }
        while(carry>0){
            int ans=carry%10;
            carry=carry/10;
            t.next = new ListNode(ans);
            t = t.next;
            System.out.println(t.val);
        }
        return res.next;
    }
}
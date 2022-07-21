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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head;
        if(left==1) return reverse(head.next,head,head,left,right);
        ListNode node = head;
        for(int i = 1;i<left-1;i++)
            node = node.next;
        node.next = reverse(node.next.next,node.next,node.next,left,right);
        return head;
    }
    public ListNode reverse(ListNode head, ListNode curr, ListNode tail, int left, int right){
        if(left!=right){
            curr.next = head.next;
            head.next = tail;
            return reverse(curr.next, curr, head, left+1, right);
        }
        return tail;
    }
}
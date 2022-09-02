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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        Queue<ListNode> q = new PriorityQueue<>((a,b)->a.val-b.val);
        int k = lists.length;
        for(int i = 0;i<k;i++){
            if(lists[i]==null) continue;
            q.add(lists[i]);
        }
        ListNode ans = new ListNode();
        ListNode head = new ListNode();
        ans = head;
        while(!q.isEmpty()){
            ListNode node = q.poll();
           // System.out.print(node.val+" ");
            if(node.next!=null)
                q.add(node.next);
            head.next = node;
            head = head.next;
        }
        return ans.next;
    }
}
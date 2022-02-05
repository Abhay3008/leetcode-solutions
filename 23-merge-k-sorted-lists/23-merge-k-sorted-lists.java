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
        List<Integer> ls = new ArrayList<>();
        
        for(int i=0;i<lists.length;i++){
            ListNode node = lists[i];
            while(node!=null){
                ls.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(ls);
        if(ls.size()==0)
            return new ListNode().next;
        ListNode node = new ListNode(ls.get(0));
        ListNode res = node;
        for(int i=1;i<ls.size();i++){
            ListNode n = new ListNode(ls.get(i));
            node.next = n;
            node = node .next; 
        }
        return res;
    }
}
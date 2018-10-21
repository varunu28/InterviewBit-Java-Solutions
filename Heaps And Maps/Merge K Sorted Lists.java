/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ArrayList<ListNode> a) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        
        for (ListNode node : a) {
            if (node != null) {
                pq.add(node);
            }
        }
        
        ListNode node = new ListNode(-1);
        ListNode curr = node;
        
        while (!pq.isEmpty()) {
            ListNode temp = pq.remove();
            curr.next = new ListNode(temp.val);
            curr = curr.next;
            
            if (temp.next != null) {
                pq.add(temp.next);
            }
        }
        
        return node.next;
    }
}


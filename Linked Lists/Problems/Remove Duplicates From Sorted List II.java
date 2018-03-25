/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        Map<Integer, Integer> map = new HashMap<>();
        ListNode curr = A;
        
        while(curr != null) {
            map.put(curr.val, map.getOrDefault(curr.val, 0) + 1);
            curr = curr.next;
        }
        
        curr = A;
        while(curr != null) {
            if (map.get(curr.val) == 1) {
                temp.next = new ListNode(curr.val);
                temp = temp.next;
            }
            curr = curr.next;
        }
        
        return ans.next;
    }
}

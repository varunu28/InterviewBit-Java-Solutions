/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode head) {
        if (head == null || head.next == null) return 1;
        int l = 0;
        ListNode curr = head;
        
        while (curr != null) {
            l++;
            curr = curr.next;
        }
        
        int i = 1;
        curr = head;
        
        while (i < l/2) {
            curr = curr.next;
            i++;
        }
        
        ListNode mid = reverse(curr.next);
        
        curr = head;
        
        while(mid != null) {
            if (curr.val != mid.val) return 0;
            curr = curr.next;
            mid = mid.next;
        }
        
        return 1;
    }
    
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode start = new ListNode(0);
        ListNode sec = start;
        
        while (A != null && B != null) {
            if (A.val > B.val) {
                sec.next = new ListNode(B.val);
                B = B.next;
            }
            else {
                sec.next = new ListNode(A.val);
                A = A.next;
            }
            sec = sec.next;
        }
        
        while (A != null) {
            sec.next = new ListNode(A.val);
            A = A.next;
            sec = sec.next;
        }
        
        while (B != null) {
            sec.next = new ListNode(B.val);
            B = B.next;
            sec = sec.next;
        }
        
        return start.next;
    }
}

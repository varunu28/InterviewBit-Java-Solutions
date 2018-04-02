/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A) {
        if (A == null) return A;
        ListNode rest = A.next;
        
        if (rest == null) return A;
        
        A.next = null;
        ListNode reverse = reverseList(rest);
        
        rest.next = A;
        return reverse;
    }
}

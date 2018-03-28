/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reorderList(ListNode A) {
        if (A == null || A.next == null) return A;
        int l = getLength(A);
        int count = 1;
        int stop = l%2 == 0 ? l/2 : l/2 + 1;
        ListNode curr = A;
        while(count < stop) {
            curr = curr.next;
            count++;
        }
        
        ListNode half = reverseList(curr.next);
        curr.next = null;
        
        curr = A;
        while (half != null) {
            ListNode temp = new ListNode(half.val);
            temp.next = curr.next;
            curr.next = temp;
            
            curr = curr.next.next;
            half = half.next;
        }
        
        return A;
    }
    
    public ListNode reverseList(ListNode A) {
        ListNode next = null;
        ListNode prev = null;
        ListNode curr = A;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    
    public int getLength(ListNode A) {
        int l = 0;
        while (A != null) {
            A = A.next;
            l++;
        }
    
        return l;
    }
}

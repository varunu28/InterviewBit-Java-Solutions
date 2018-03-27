/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode A) {
        ListNode curr = A;
        while (curr != null) {
            ListNode temp = curr;
            ListNode swap = null;
            int minVal = Integer.MAX_VALUE;
            
            while (temp != null) {
                if (temp.val < minVal) {
                    minVal = temp.val;
                    swap = temp;
                }
                
                temp = temp.next;
            }
            
            swap.val = curr.val;
            curr.val = minVal;
            
            curr = curr.next;
        }
        
        return A;
    }
}

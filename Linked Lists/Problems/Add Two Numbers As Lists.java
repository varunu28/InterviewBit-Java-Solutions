/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        int temp = 0;
        
        int carry = 0 ;
        while(A != null && B != null) {
            temp = A.val + B.val + carry;
            carry = temp > 9 ? 1 : 0;
            temp = temp%10;
            
            curr.next =  new ListNode(temp);
            curr = curr.next;
            A = A.next;
            B = B.next;
        }
        
        while (A != null) {
            temp = A.val + carry;
            carry = temp > 9 ? 1 : 0;
            temp = temp%10;
            
            curr.next =  new ListNode(temp);
            curr = curr.next;
            A = A.next;
        }
        
        while (B != null) {
            temp = B.val + carry;
            carry = temp > 9 ? 1 : 0;
            temp = temp%10;
            
            curr.next =  new ListNode(temp);
            curr = curr.next;
            B = B.next;
        }
        
        if (carry != 0) {
            curr.next =  new ListNode(carry);
            curr = curr.next;
        }
        
        return ans.next;
    }
}

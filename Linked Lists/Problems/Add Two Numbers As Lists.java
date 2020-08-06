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
    ListNode dummy = new ListNode(-1);
    ListNode curr = dummy;
    int carry = 0;
    while (A != null || B != null || carry > 0) {
      int temp = carry + (A != null ? A.val : 0) + (B != null ? B.val : 0);
      carry = temp > 9 ? 1 : 0;
      temp %= 10;
      curr.next = new ListNode(temp);
      curr = curr.next;
      A = A != null ? A.next : A;
      B = B != null ? B.next : B;
    }
    return dummy.next;
  }
}

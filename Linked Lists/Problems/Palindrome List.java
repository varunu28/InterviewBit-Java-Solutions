/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
  public int lPalin(ListNode A) {
    int length = 0;
    ListNode curr = A;
    while (curr != null) {
      curr = curr.next;
      length++;
    }
    curr = A;
    int count = 1;
    while (count < length / 2) {
      count++;
      curr = curr.next;
    }
    ListNode rev = reverse(curr.next);
    curr = A;
    while (curr != null && rev != null) {
      if (curr.val != rev.val) {
        return 0;
      }
      curr = curr.next;
      rev = rev.next;
    }
    return 1;
  }

  private ListNode reverse(ListNode node) {
    ListNode curr = node;
    ListNode prev = null;
    ListNode next = null;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }
}

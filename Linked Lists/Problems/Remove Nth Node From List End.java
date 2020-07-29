/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
  public ListNode removeNthFromEnd(ListNode A, int B) {
    if (A == null) {
      return A;
    }
    ListNode curr = A;
    int count = 0;
    while (curr != null) {
      curr = curr.next;
      count++;
    }
    if (B >= count) {
      return A.next;
    }
    curr = A;
    int stop = count - B;
    count = 1;
    while (count < stop) {
      curr = curr.next;
      count++;
    }
    curr.next = curr.next.next;
    return A;
  }
}

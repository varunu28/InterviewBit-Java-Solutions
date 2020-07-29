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
    ListNode curr = A;
    ListNode prev = null;
    ListNode newHead = null;
    while (curr != null) {
      ListNode temp = curr;
      int count = 0;
      while (temp != null && temp.val == curr.val) {
        temp = temp.next;
        count++;
      }
      if (count == 1) {
        if (newHead == null) {
          newHead = curr;
        }
        prev = curr;
      }
      else {
        if (prev != null) {
          prev.next = temp;
        }
      }
      curr = temp;
    }
    return newHead;
  }
}

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
    while (curr != null) {
      int val = curr.val;
      ListNode temp = curr;
      while (temp != null && temp.val == val) {
        temp = temp.next;
      }
      curr.next = temp;
      curr = curr.next;
    }
    return A;
  }
}


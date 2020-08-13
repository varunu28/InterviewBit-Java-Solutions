/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
  public ListNode detectCycle(ListNode a) {
    ListNode slow = a;
    ListNode fast = a;
    boolean cycleFound = false;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        cycleFound = true;
        break;
      }
    }
    if (!cycleFound) {
      return null;
    }
    slow = a;
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow;
  }
}

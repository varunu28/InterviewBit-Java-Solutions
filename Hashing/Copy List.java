/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
  public RandomListNode copyRandomList(RandomListNode head) {
    if (head == null) {
      return head;
    }
    Map<RandomListNode, RandomListNode> map = new HashMap<>();
    RandomListNode curr = head;
    while (curr != null) {
      map.put(curr, new RandomListNode(curr.label));
      curr = curr.next;
    }
    curr = head;
    while (curr != null) {
      RandomListNode copy = map.get(curr);
      if (curr.next != null) {
        copy.next = map.get(curr.next);
      }
      copy.random = map.get(curr.random);
      curr = curr.next;
    }
    return map.get(head);
  }
}

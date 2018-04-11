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
        if(head == null) return null;
        
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode newHead = new RandomListNode(head.label);
        RandomListNode node1 = head;
        RandomListNode node2 = newHead;
        
        map.put(node1, node2);
        node1 = node1.next;
        
        while(node1 != null) {
            RandomListNode temp = new RandomListNode(node1.label);
            map.put(node1, temp);
            node2.next = temp;
            node2 = node2.next;
            node1 = node1.next;
        }
        
        node1 = head;
        node2 = newHead;
        
        while(node1 != null) {
            if(node1.random != null) {
                node2.random = map.get(node1.random);
            }
            else {
                node2.random = null;
            }
            
            node1 = node1.next;
            node2 = node2.next;
        }
        
        return newHead;
    }
}

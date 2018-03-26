/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        int l = getLength(A);
        ListNode curr = A;
        int stop = B%l;
        if(stop == 0) return A;
        stop = l - stop;
        
        A = rotate(A, stop);
        return A;
    }
    
    public ListNode rotate(ListNode A, int stop) {
        ListNode curr = A;
        ListNode head = null;
        while(stop != 1) {
            curr = curr.next;
            stop--;
        }
        
        head = curr.next;
        curr.next = null;
        
        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        
        temp.next = A;
        
        return head;
    }
    
    public int getLength(ListNode A) {
        int l = 0;
        while (A != null) {
            A = A.next;
            l++;
        }
        
        return l;
    }
}

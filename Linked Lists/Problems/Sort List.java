/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode A) {
        int[] arr = new int[getLength(A)];
        ListNode curr = A;
        int i = 0;
        while (curr != null) {
            arr[i++] = curr.val;
            curr = curr.next;
        }
        
        Arrays.sort(arr);
        
        curr = A;
        i = 0;
        while (curr != null) {
            curr.val = arr[i++];
            curr = curr.next;
        }
        
        return A;
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

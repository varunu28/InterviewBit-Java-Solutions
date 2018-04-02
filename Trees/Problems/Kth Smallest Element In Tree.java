/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int kthsmallest(TreeNode A, int k) {
        Stack<TreeNode> stack = new Stack<>();
        
        while(A != null) {
            stack.push(A);
            A = A.left;
        }
        
        while (k != 0) {
            TreeNode n = stack.pop();
            k--;
            if (k==0) return n.val;
            TreeNode right = n.right;
            
            while (right != null) {
                stack.push(right);
                right = right.left;
            }
        }
        
        return -1;
    }
}

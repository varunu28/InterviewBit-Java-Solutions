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
    
    public int sumNumbers(TreeNode A) {
        return sum(A, 0)%1003;
    }
    
    public int sum(TreeNode root, int mul) {
        
        if (root == null) return 0;
        
        if (root.left == null && root.right == null) {
            return (mul*10 + root.val)%1003;
        }
    
        int num = mul*10 + root.val;
        num %= 1003;
        int ans = (sum(root.left, num) + sum(root.right, num));
        
        return ans%1003;
    }
}

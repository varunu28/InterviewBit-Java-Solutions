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
    public int isSameTree(TreeNode A, TreeNode B) {
        if (A == null && B == null) return 1;
        if ((A == null && B != null) || (A != null && B == null)) return 0;
        if (A.val != B.val) return 0;
        
        return Math.min(isSameTree(A.left, B.left), isSameTree(A.right, B.right));
    }
}

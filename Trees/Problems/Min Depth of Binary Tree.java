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
    public int minDepth(TreeNode A) {
        if (A == null) return 0;
        
        if (A.left == null && A.right != null) return 1 + minDepth(A.right);
        if (A.left != null && A.right == null) return 1 + minDepth(A.left);
        
        return 1 + Math.min(minDepth(A.left), minDepth(A.right));
    }
}

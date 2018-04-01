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
    public int hasPathSum(TreeNode A, int B) {
        if (A == null) {
            return 0;
        }
        
        if (A.left == null && A.right == null) {
            return B - A.val == 0 ? 1 : 0;
        }
        
        B -= A.val;
        
        return Math.max(hasPathSum(A.left, B), hasPathSum(A.right, B));
    }
}

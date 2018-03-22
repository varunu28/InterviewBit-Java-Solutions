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
    public int isValidBST(TreeNode A) {
        return isBSTUtil(A, Integer.MIN_VALUE, Integer.MAX_VALUE) == true ? 1 : 0;
    }

    public boolean isBSTUtil(TreeNode node, int min, int max) {
        if (node == null)
            return true;
            
        if (node.val < min || node.val > max)
            return false;

        return (isBSTUtil(node.left, min, node.val-1) &&
                isBSTUtil(node.right, node.val+1, max));
    }
}

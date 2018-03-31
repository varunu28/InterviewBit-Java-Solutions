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
    public int isSymmetric(TreeNode A) {
        if (A == null) return 1;
        
        return areNodeSymmetric(A.left, A.right) == true ? 1 : 0;
    }
    
    public boolean areNodeSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if ((node1 == null && node2 != null) || (node1 != null && node2 == null)) return false;
        if (node1.val != node2.val) return false;
        
        return areNodeSymmetric(node1.left, node2.right) && areNodeSymmetric(node1.right, node2.left);
    }
}

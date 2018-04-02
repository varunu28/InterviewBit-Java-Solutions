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
    public TreeNode invertTree(TreeNode A) {
        if (A == null) return A;
        swap(A);
        return A;
    }
    
    public void swap(TreeNode root) {
        if (root.left == null && root.right == null) {
            return;
        }
        TreeNode n1 = root.left;
        root.left = root.right;
        root.right = n1;
        
        if (root.left != null) swap(root.left);
        if (root.right != null) swap(root.right);
    }
}

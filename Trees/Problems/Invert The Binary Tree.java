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
    if (A == null) {
      return null;
    }
    TreeNode left = A.left;
    A.left = A.right;
    A.right = left;
    invertTree(A.left);
    invertTree(A.right);
    return A;
  }
}

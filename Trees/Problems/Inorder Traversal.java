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
  public ArrayList<Integer> inorderTraversal(TreeNode A) {
    ArrayList<Integer> list = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    while (A != null) {
      stack.push(A);
      A = A.left;
    }
    while (!stack.isEmpty()) {
      TreeNode removed = stack.pop();
      list.add(removed.val);
      TreeNode right = removed.right;
      while (right != null) {
        stack.push(right);
        right = right.left;
      }
    }
    return list;
  }
}

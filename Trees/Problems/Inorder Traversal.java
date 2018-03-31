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
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = A;
        if (node == null) return arr;
        
        while (node != null) {
            stack.add(node);
            node = node.left;
        }
        
        while (!stack.isEmpty()) {
            node = stack.pop();
            arr.add(node.val);
            
            if (node.right != null) {
                node = node.right;
                while (node != null) {
                    stack.add(node);
                    node = node.left;
                }
            }
        }
        
        return arr;
    }
}

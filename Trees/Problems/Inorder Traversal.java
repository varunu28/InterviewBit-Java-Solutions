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
       
        if (A == null) return arr;
        
        while (true) {
            if (A != null) {
            	stack.push(A);
            	A = A.left;
            }
            else {
            	if (stack.isEmpty()) {
            		break;
            	}
            	A = stack.pop();
            	arr.add(A.val);
            	A = A.right;
            }
        }
        
        return arr;
    }
}

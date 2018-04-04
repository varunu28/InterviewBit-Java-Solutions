/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    TreeNode head = new TreeNode(0);
    TreeNode curr = head;
    
	public TreeNode flatten(TreeNode a) {
	    preorder(a);
	    return head.right;
	}
	
	public void preorder(TreeNode a) {
	    if (a == null) return;
	    
	    curr.right = new TreeNode(a.val);
	    curr = curr.right;
	    
	    preorder(a.left);
	    preorder(a.right);
	}
}

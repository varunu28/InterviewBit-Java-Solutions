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

	public TreeNode getSuccessor(TreeNode root, int b) {
	    if(root==null)
            return null;
 
        TreeNode next = null;
        TreeNode c = root;
        while(c!=null && c.val!=b){
            if(c.val > b){
                next = c;
                c = c.left;
            }else{
                c= c.right;
            }
        }
     
        if(c==null)        
            return null;
     
        if(c.right==null)
            return next;
     
        c = c.right;
        while(c.left!=null)
            c = c.left;
     
        return c;
	}
}

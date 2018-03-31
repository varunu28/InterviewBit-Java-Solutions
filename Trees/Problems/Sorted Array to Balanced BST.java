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
	public TreeNode sortedArrayToBST(final List<Integer> a) {
	    return constructBST(a, 0, a.size()-1);
	}
	
	public TreeNode constructBST(final List<Integer> a, int start, int end) {
	    if (start > end) return null;
	    
	    int mid = (start + end)/2;
	    TreeNode root = new TreeNode(a.get(mid));
	    
	    root.left = constructBST(a, start, mid-1);
	    root.right = constructBST(a, mid+1, end);
	    
	    return root;
	}
}

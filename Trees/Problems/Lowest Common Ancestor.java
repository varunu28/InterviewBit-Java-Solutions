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
    public int lca(TreeNode A, int B, int C) {
        if(!doesExist(A, B) || !doesExist(A, C)) {
            return -1;
        }
        
        TreeNode ans = lcaImpl(A, B, C);
        return ans == null ? -1 : ans.val;
    }
    
    public TreeNode lcaImpl(TreeNode A, int B, int C) {
        if (A == null) return null;
        
        if (A.val == B || A.val == C) {
            return A;
        }
        
        TreeNode l = lcaImpl(A.left, B, C);
        TreeNode r = lcaImpl(A.right, B, C);
        
        if (l != null && r != null) {
            return A;
        }
        
        return l != null ? l : r;
    }
    
    public boolean doesExist(TreeNode root, int num) {
        if (root == null) return false;
        if (root.val == num) return true;
        
        return doesExist(root.left, num) || doesExist(root.right, num); 
    }
}

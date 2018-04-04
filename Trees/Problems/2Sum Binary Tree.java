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
    Set<Integer> set = new HashSet<>();
    public int t2Sum(TreeNode A, int B) {
        if (A == null) return 0;
        if (set.contains(B-A.val)) {
            return 1;
        }
        
        set.add(A.val);
        
        return Math.max(t2Sum(A.left, B), t2Sum(A.right, B));
    }
}

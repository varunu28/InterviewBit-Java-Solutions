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
    public TreeNode buildTree(ArrayList<Integer> A) {
        return constructInorderTree(A, 0, A.size()-1);
    }
    
    public TreeNode constructInorderTree(ArrayList<Integer> A, int start, int end) {
        if (start > end) return null;
        
        int idx = findMax(A, start,end);
        TreeNode root = new TreeNode(A.get(idx));
        
        root.left = constructInorderTree(A, start, idx-1);
        root.right = constructInorderTree(A, idx+1, end);
        
        return root;
    }
    
    public int findMax(ArrayList<Integer> A, int start, int end) {
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for (int i=start; i<=end; i++) {
            if(max < A.get(i)) {
                max = A.get(i);
                idx = i;
            }
        }
        
        return idx;
    }
}

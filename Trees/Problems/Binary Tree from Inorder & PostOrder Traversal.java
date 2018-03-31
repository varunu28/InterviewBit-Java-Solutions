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
    int bEnd = 0;

    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() == 0) return null;
        bEnd = B.size()-1;
        return constructBT(A, B, 0, A.size()-1);
    }
    
    public TreeNode constructBT(ArrayList<Integer> A, ArrayList<Integer> B, int aStart, int aEnd) {
        if (aStart > aEnd) return null;
        
        TreeNode root = new TreeNode(B.get(bEnd--));
        
        if (aStart == aEnd) return root;
        int idx = findIdx(A, aStart, aEnd, root.val);
        
        root.right = constructBT(A,B,idx+1, aEnd);
        root.left = constructBT(A,B,aStart, idx-1);
        
        return root;
    }
    
    public int findIdx(ArrayList<Integer> A, int start, int end, int num) {
        for (int i=start;i<=end;i++) {
            if (A.get(i) == num) return i;
        }
        
        return -1;
    }
}

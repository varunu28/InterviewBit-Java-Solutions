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
    
    Map<Integer,ArrayList<Integer>> map = new HashMap<>();
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        int h = height(A);
        
        for (int i=1;i<=h; i++) {
            populateMap(A, i, 1);
        }
        
        for (int i=1;i<=h;i++) {
            ArrayList<Integer> temp = map.get(i);
            if (i%2 == 0) {
                Collections.reverse(temp);
            }
            ans.add(temp);
        }
        
        return ans;
    }
    
    public void populateMap(TreeNode root, int level, int actualLevel) {
        if (root == null) return;
        if (level == 1) {
            ArrayList<Integer> temp;
            if (!map.containsKey(actualLevel)) {
                temp = new ArrayList<>();
            }
            else {
                temp = map.get(actualLevel);
            }
            
            temp.add(root.val);
            map.put(actualLevel, temp);
        }
        else {
            populateMap(root.left, level-1, actualLevel+1);
            populateMap(root.right, level-1, actualLevel+1);
        }
    }
    
    public int height(TreeNode A) {
        if (A == null) return 0;
        return 1 + Math.max(height(A.left), height(A.right));
    }
}

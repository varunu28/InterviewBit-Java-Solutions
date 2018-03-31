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
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(A == null) return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> levelNodeMap = new HashMap<>();
        Queue<Integer> levels = new LinkedList<Integer>();
        
        queue.offer(A);
        levels.offer(0);
        Integer minLevel=0;
        Integer maxLevel=0;
        
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            Integer level = levels.poll();
            minLevel = Math.min(level, minLevel);
            maxLevel = Math.max(maxLevel, level);
            
            if(!levelNodeMap.containsKey(level)){
                levelNodeMap.put(level, new ArrayList<Integer>());
            }
            levelNodeMap.get(level).add(node.val);
            if(node.left != null) {
                queue.offer(node.left);
                levels.offer(level - 1);
            }
            if(node.right != null) {
                queue.offer(node.right);
                levels.offer(level + 1);
            }
        }
        
        for(int level = minLevel; level <= maxLevel; ++level){
            if(levelNodeMap.containsKey(level)){
                result.add(levelNodeMap.get(level));
            }
        }
        
        return result;
    }
}

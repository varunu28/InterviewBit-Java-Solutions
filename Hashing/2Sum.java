public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<A.size(); i++) {
            if (map.containsKey(B-A.get(i))) {
                ans.add(map.get(B-A.get(i)) + 1);
                ans.add(i+1);
                break;
            }
            else if (!map.containsKey(A.get(i))) {
                map.put(A.get(i), i);
            }
        }
        
        return ans;
    }
}

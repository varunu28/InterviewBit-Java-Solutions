public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int max = Integer.MIN_VALUE;
        int end = 0;
        
        for (int i=0;i<A.size();i++) {
            end = end + A.get(i);
            
            if (max < end) max = end;
            
            if (end < 0) {
                end = 0;
            }
        }
        
        return max;
    }
}

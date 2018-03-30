public class Solution {
    public int maxArea(ArrayList<Integer> A) {
        if (A.size() <= 1) return 0;
        int left = 0;
        int right = A.size()-1;
        int max = Integer.MIN_VALUE;
        
        while (left < right) {
            int diff = right - left;
            int base = Math.min(A.get(left), A.get(right));
            max = Math.max(max, diff*base);
            
            if (A.get(left) == base) {
                left++;
            }
            else right--;
        }
        
        return max;
    }
}

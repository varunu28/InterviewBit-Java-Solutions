public class Solution {
	public int sqrt(int x) {
	    if (x <= 1)
            return x;
        long start = 0, end = x/2 + 1;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (mid*mid == x) {
                return (int)mid;
            }
            if (mid*mid < x) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        
        return (int)end;
	}
}

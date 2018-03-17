public class Solution {
	// DO NOT MODIFY THE LIST
    public int search(final List<Integer> a, int b) {
	    return binarySearch(a, 0, a.size()-1, b);
	}
	
	public int binarySearch(List<Integer> a, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end)/2;
            if (a.get(mid) == target) {
                return mid;
            }
            else if (a.get(start) <= a.get(mid)) {
                if (target >= a.get(start) && a.get(mid) >= target) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if (a.get(mid+1) <= target && a.get(end) >= target) {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}

public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {
	    return binarySearch(a, 0, a.size()-1, b);
	}
	
	public int binarySearch(ArrayList<Integer> a, int start, int end, int b) {
	    boolean less = false;
	    int mid = 0;
	    while (start <= end) {
	        mid = (start + end)/2;
	        if (a.get(mid) == b) {
	            return mid;
	        }
	        else if (a.get(mid) < b) {
	            start = mid + 1;
	            less = true;
	        }
	        else {
	            end = mid - 1;
	            less = false;
	        }
	    }
	    if (less) {
	        mid++;
	    }
	    return mid;
	}
}

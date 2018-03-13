public class Solution {
	// DO NOT MODIFY THE LIST
	public int findMin(final List<Integer> a) {
	    return getMin(a, 0, a.size()-1);
	}
	
	public int getMin(List<Integer> a, int start, int end) {
	    while (start <= end) {
	        if (a.get(start) <= a.get(end)) return a.get(start);
	        int mid = (start+end)/2;
	        int next = (mid+1)%(end+1);
	        int prev = (mid + end)%(end+1);
	        if (a.get(mid) <= a.get(next) && a.get(mid) <= a.get(prev)) {
	            return a.get(mid);
	        }
	        if (a.get(mid) <= a.get(end)) {
	            end = mid-1;
	        }
	        if (a.get(mid) >= a.get(start)) {
	            start = mid+1;
	        }
	    } 
	    
	    return -1;
	}
}

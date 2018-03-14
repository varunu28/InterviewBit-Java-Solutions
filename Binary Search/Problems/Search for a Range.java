public class Solution {
	// DO NOT MODIFY THE LIST
	ArrayList<Integer> ans = new ArrayList<>();
	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
	    ans.add(-1);
	    ans.add(-1);
	    findRange(a, 0, a.size()-1, b);
	    
	    return ans;
	}
	
	public void findRange(List<Integer> a, int start, int end, int b) {
	    int mid = 0;
	    while (start <= end) {
	        mid = (start + end)/2;
	        if (a.get(mid) == b) {
	            int low = findExtreme(a, start, mid-1, b, true);
	            int high = findExtreme(a, mid+1, end, b, false);
	            
	            ans.set(0, low == -1 ? mid : low);
	            ans.set(1, high == -1 ? mid : high);
	            return;
	        }
	        else if (a.get(mid) < b) {
	            start = mid+1;
	        }
	        else {
	            end = mid-1;
	        }
	    }
	}
	
	public int findExtreme(List<Integer> a, int start, int end, int b, boolean left) {
	    int idx = -1;
	    int mid = 0;
	    while (start <= end) {
	        mid = (start + end)/2;
	        if (a.get(mid) == b) {
    	        idx = mid;
    	        if (left) {
    	            end = mid-1;
    	        }
    	        else {
    	            start = mid+1;
    	        }
    	    }
            else if (a.get(mid) < b) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
	    }
	    
	    return idx;
	}
}

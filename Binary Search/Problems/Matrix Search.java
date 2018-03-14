public class Solution {
	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	    if (a.size() == 0) return 0;
	    return binarySearch(a, 0, a.size()-1, a.get(0).size()-1, b);
	}
	
	public int binarySearch(ArrayList<ArrayList<Integer>> a, int start, int end, int subSize, int b) {
	    while (start <=  end) {
	        int mid = (start + end)/2;
	        if (a.get(mid).get(0) == b) return 1;
	        if (a.get(mid).get(subSize) == b) return 1;
	        
	        if (a.get(mid).get(0) > b) {
	            end = mid-1;
	        } 
	        else if (a.get(mid).get(0) < b && a.get(mid).get(subSize) < b) {
	            start = mid + 1;
	        }
	        else {
	            return binarySearchSubArray(a.get(mid), 0, subSize, b); 
	        }
	    }
	    return 0;
	}
	
	public int binarySearchSubArray(ArrayList<Integer> a, int start, int end, int b) {
	    while (start <= end) {
	        int mid = (start + end)/2;
	        if (a.get(mid) == b) {
	            return 1;
	        }
	        else if (a.get(mid) < b) {
	            start = mid + 1;
	        }
	        else {
	            end = mid - 1;
	        }
	    }
	    return 0;
	}
}

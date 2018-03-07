public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    int[] arr = new int[a.size()-1];
	    
	    for(int num : a) {
	        arr[num-1]++;
	        if (arr[num-1] > 1) {
	            return num;
	        }
	    }
	    
	    return -1;
	}
}

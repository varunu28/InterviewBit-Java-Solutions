public class Solution {
	public void sortColors(ArrayList<Integer> a) {
	    int[] arr = new int[3];
	    
	    for (int num : a) {
	        arr[num]++;
	    }
	    
	    for (int i=0;i<a.size(); i++) {
	        if (arr[0] != 0) {
	            a.set(i, 0);
	            arr[0]--;
	        }
	        else if (arr[1] != 0) {
	            a.set(i, 1);
	            arr[1]--;
	        }
	        else {
	            a.set(i,2);
	            arr[2]--;
	        }
	    }
	}
}

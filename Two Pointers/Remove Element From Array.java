public class Solution {
	public int removeElement(ArrayList<Integer> a, int b) {
	    int i = 0;
	    int j = 0;
	    
	    while (i<a.size()) {
	        if (a.get(i) != b) {
	            if (i != j) {
	                a.set(j, a.get(i));
	                a.set(i, b);
	            }
	            j++;
	        }
	        i++;
	    }
	    
	    return j;
	}
}

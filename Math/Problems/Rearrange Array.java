public class Solution {
	public void arrange(ArrayList<Integer> A) {
	    int n = A.size();
	    for (int i = 0; i < n; i++) {
	        A.set(i, A.get(i) + (A.get(A.get(i)) % n) * n );
	    }
	    for (int i = 0; i < n; i++) {
	        A.set(i, A.get(i) / n);
	    }
	}
}

class Solution {
	public int findMedian(ArrayList<ArrayList<Integer>> A) {
	    int n = A.size();
	    if(n == 0) return -1;
	    int m = A.get(0).size();
	    int lo = 0;
	    int hi = Integer.MAX_VALUE;
	    int x = 1;
	    while(lo <= hi) {
	        int mid = (lo+hi)/2;
	        if(isLessThanHalf(A, mid)) {
	            lo = mid+1;
	        } else {
	            x = mid;
	            hi = mid-1;
	        }
	    }
	    return x;
	}

	boolean isLessThanHalf(ArrayList<ArrayList<Integer>> a, int num) {
	    int N = a.size();
	    int M = a.get(0).size();
	    int count = 0;
	      
	    for(int i = 0; i < N; i++) {
	        count += getCount(a.get(i), num);
	    }
	    return count < (N*M)/2 + 1;
	}

	int getCount(ArrayList<Integer> a, int n) {
	    int lo = 0;
	    int hi = a.size()-1;
	    while(lo <= hi) {
	        int mid = (lo+hi)/2;
	        if(a.get(mid) > n) hi = mid-1;
	        else lo = mid+1;
	    }
	    return lo;
	}
}
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int findCount(final List<Integer> A, int B) {
        return getCount(A, 0, A.size()-1, B);
    }
    
    public int getCount(List<Integer> A, int start, int end, int num) {
        if (end < start) return 0;
        int mid = (start + end)/2;
        if (A.get(mid) == num) {
            return 1 + getCount(A, start, mid-1, num) + getCount(A, mid+1, end, num);
        }
        else if (A.get(mid) > num) {
            return 0 + getCount(A, start, mid-1, num);
        }
        else {
            return 0 + getCount(A, mid+1, end, num);
        }
    }
}

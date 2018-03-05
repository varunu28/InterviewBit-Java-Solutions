public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size();
        for (int i=0; i<n; i++) {
            if (i < n-1 && A.get(i) == A.get(i+1)) {
                continue;
            }
            
            if (n - i - 1 == A.get(i)) {
                return 1;
            }
        }
        
        return -1;
    }
}

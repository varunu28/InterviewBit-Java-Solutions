public class Solution {
    public int isPrime(int A) {
        if (A == 1) return 0;
        int sq = (int)Math.sqrt(A);
        
        for (int i=2; i<=sq;i++) {
            if (A%i == 0) {
                int a = i;
                int b = A/i;
                if ((a<sq && b > sq) || (a == b)) {
                    return 0;
                }
            }
        }
        
        return 1;
    }
}

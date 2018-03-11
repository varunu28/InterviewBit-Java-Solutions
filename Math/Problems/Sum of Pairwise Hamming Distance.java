public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List<Integer> A) {
        long sum=0;
        long n=A.size();
        int M = 1000000007;
        for(long i=0;i<31;i++) {
            long counter=0;

            for(int j=0;j<n;j++) {
                if(((long)A.get(j) & (long)(1<<i)) > 0) {
                    counter++;
                }
            }

            sum = (sum + counter * (n-counter))%M;

        }
        return (int) (sum << 1)%M;
    }
}

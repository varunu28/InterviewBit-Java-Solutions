public class Solution {
    public ArrayList<Integer> sieve(int A) {
        boolean[] isPrime = new boolean[A+1];

        for (int i=2; i<=A; i++) {
            if (!isPrime[i]) {
                for (int j=2;j*i<=A;j++) {
                    isPrime[i*j] = true;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i=2;i<A+1;i++) {
            if (!isPrime[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}

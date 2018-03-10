public class Solution {
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> primes = sieve(A);
        boolean flag = false;
        
        for (int i=0;i<primes.size();i++) {
            for (int j=i; j<primes.size();j++) {
                if (primes.get(i) + primes.get(j) == A) {
                    ans.add(primes.get(i));
                    ans.add(primes.get(j));
                    flag = true;
                    break;
                }
            }
            
            if (flag) break;
        }
        
        return ans;
    }
    
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

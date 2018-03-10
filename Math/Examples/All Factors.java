public class Solution {
    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        ArrayList<Integer> small = new ArrayList<Integer>();
        ArrayList<Integer> large = new ArrayList<Integer>();
        
        for(int i=1; i<=Math.sqrt(A); i++) {
            if (A%i == 0) {
                int a = i;
                int b = A/i;
                if (a != b) {
                    small.add(a);
                    large.add(b);
                }
                else {
                    small.add(a);
                }
            }
        }
        
        for (int num : small) {
            factors.add(num);
        }
        
        for(int i=large.size()-1;i>=0; i--) {
            factors.add(large.get(i));
        }
        return factors;
    }
}

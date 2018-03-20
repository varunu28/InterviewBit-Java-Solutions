public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int minXor = Integer.MAX_VALUE;
        
        for (int i=0; i<A.size()-1; i++) {
            minXor = Math.min(minXor, A.get(i)^A.get(i+1));    
        }
        
        return minXor;
    }
}

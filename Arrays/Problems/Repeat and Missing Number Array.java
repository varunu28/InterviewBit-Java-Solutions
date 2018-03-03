public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        int n = a.size();
        
        long sumOfNum = (((long) n) * ((long) n + 1)) / 2;
        long sumOfSq = (((long) n) * ((long) n + 1) * ((long) 2*n + 1)) / 6;
    
        for (int i=0; i < n; i++) {
            sumOfNum -= (long) a.get(i);
        }
 
        for (int i=0; i < n; i++) {
            sumOfSq -= (long) a.get(i) * (long) a.get(i);
        }
        
        long sumNum = sumOfSq/sumOfNum;
        
        int missing = (int) (sumNum + sumOfNum)/2;
        int repeated = (int) (sumNum - missing);
        
        res.add(repeated);
        res.add(missing);
        
        return res;
    }
}

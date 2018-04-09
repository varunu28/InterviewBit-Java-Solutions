public class Solution {
    public int colorful(int A) {
        Set<Integer> set = new HashSet<>();
        String a = String.valueOf(A);
        
        for (int i=0;i<a.length();i++) {
            for (int j=i;j<=a.length(); j++) {
                String numStr = a.substring(i,j);
                
                if (numStr.length() > 0) {
                    int mul = findProd(Integer.parseInt(numStr));
                    if (set.contains(mul)) {
                        return 0;
                    }
                    
                    set.add(mul);
                }
            }
        }
        
        return 1;
    }
    
    public int findProd(int s) {
        int prd = 1;
        while (s>0) {
            prd *= s%10;
            s /= 10;
        }
        
        return prd;
    }
}

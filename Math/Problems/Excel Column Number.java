public class Solution {
    public int titleToNumber(String A) {
        int col = 0;
        int mul = 26;
        int pow = A.length()-1;
        
        for (int i=0; i<A.length(); i++) {
            if (i == A.length()-1) {
                col += (int)A.charAt(i) - 65 + 1;
            }
            else {
                col += (Math.pow(26, pow))*((int)A.charAt(i) - 65 + 1);
            }
            pow--;
        }
        
        return col;
    }
}

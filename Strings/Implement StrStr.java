public class Solution {
    public int strStr(final String A, final String B) {
        if (B.isEmpty()) return -1;
        if (A.isEmpty() && B.isEmpty()) return -1;
        if (A.length() < B.length()) return -1;
        
        int needleLen = B.length();
        int hayLen = A.length();
        
        for (int i=0; i<hayLen-needleLen+1; i++) {
            if (A.substring(i, i+needleLen).equals(B)) {
                return i;
            }
        }
        
        return -1;
    }
}

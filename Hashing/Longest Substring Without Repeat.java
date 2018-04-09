public class Solution {
    public static int lengthOfLongestSubstring(String A) {
        int ans = Integer.MIN_VALUE;
        int[] count = new int[62];
        int n = A.length();
        int i = 0;
        int j = 0;
        
        while (i < n) {
            
            int ascii = getAscii(A.charAt(i));
            
            if (count[ascii] == 0) {
                count[ascii]++;
                i++;
            }
            else {
                while (count[ascii] != 0) {
                	count[getAscii(A.charAt(j))]--;
                	j++;
                }
            }
            
            ans = Math.max(ans, i-j);
        }
        
        return Math.max(ans, i-j);
    }
    
    public static int getAscii(char c) {
        int ascii = -1;
        if ((int)c >= 97 && (int)c <= 122) {
            ascii = (int)c - 97;
        }
        else if ((int)c >= 65 && (int)c <= 90) {
            ascii = (int)c - 65 + 26;
        }
        else {
            ascii = 52 + Integer.parseInt(String.valueOf(c));
        }
        
        return ascii;
    }
}

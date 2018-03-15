public class Solution {
    public int lengthOfLastWord(final String A) {
        StringBuilder sb = new StringBuilder("");
        int prev = 0;
        
        for (int i=0; i<A.length(); i++) {
            if (A.charAt(i) == ' ') {
                prev = sb.length() != 0 ? sb.length() : prev;
                sb = new StringBuilder("");
            }
            else {
                sb.append(A.charAt(i));
            }
        }
        
        return sb.length() == 0 ? prev : sb.length();
    }
}

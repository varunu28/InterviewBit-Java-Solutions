public class Solution {
    public int isPalindrome(String A) {
        StringBuilder sb = new StringBuilder("");
        for (char c : A.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        
        String str = sb.toString();
        sb.setLength(0);
        String rev = sb.append(str).reverse().toString();
        
        return str.equals(rev) ? 1 : 0;
    }
}

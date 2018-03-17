public class Solution {
    public String addBinary(String A, String B) {
        int max = Math.max(A.length(), B.length());
        A = String.join("", Collections.nCopies(max - A.length(), "0")) + A;
        B = String.join("", Collections.nCopies(max - B.length(), "0")) + B;

        StringBuilder sb = new StringBuilder("");
        int carry = 0;
        for (int i=A.length()-1; i>=0; i--) {
            int sum = Character.getNumericValue(A.charAt(i)) + Character.getNumericValue(B.charAt(i)) + carry;
            if (sum == 2) {
                sb.append('0');
                carry = 1;
            }
            else if (sum == 3){
                sb.append('1');
                carry = 1;
            }
            else {
                sb.append(sum);
                carry = 0;
            }
        }
        
        if (carry != 0) sb.append(carry);
        String ans = sb.reverse().toString().replaceFirst ("^0*", "");

        return ans;
    }
}

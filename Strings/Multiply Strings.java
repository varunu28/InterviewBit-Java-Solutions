public class Solution {
    public static String multiply(String A, String B) {
        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();
        int[] calc = new int[arrA.length + arrB.length];

        for (int i=arrA.length-1; i>=0; --i) {
            for (int j=arrB.length-1; j>=0; --j) {
                calc[i + j + 1] += Character.getNumericValue(arrA[i]) * Character.getNumericValue(arrB[j]);
                calc[i + j] += calc[i + j + 1] / 10;
                calc[i + j + 1] %= 10;
            }
        }

        StringBuilder sb = new StringBuilder("");

        for (int c : calc) {
            sb.append(c);
        }
        
        String ans = sb.toString().replaceFirst("^0*", "");
        return ans.isEmpty() ? "0" : ans;
    }
}

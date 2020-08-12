public class Solution {
  public String addBinary(String A, String B) {
    int idx1 = A.length() - 1;
    int idx2 = B.length() - 1;
    int carry = 0;
    StringBuilder sb = new StringBuilder();
    while (idx1 >= 0 || idx2 >= 0 || carry > 0) {
      int val = carry;
      if (idx1 >= 0) {
        val += Character.getNumericValue(A.charAt(idx1--));
      }
      if (idx2 >= 0) {
        val += Character.getNumericValue(B.charAt(idx2--));
      }
      carry = val > 1 ? 1 : 0;
      val = val > 1 ? (val == 2 ? 0 : 1) : val;
      sb.append(val);
    }
    return sb.reverse().toString();
  }
}

public class Solution {
  public String multiply(String A, String B) {
    int aLength = A.length();
    int bLength = B.length();
    int[] values = new int[aLength + bLength];
    int idx = values.length - 1;
    for (int i = aLength - 1; i >= 0; i--) {
      int currIdx = idx;
      int mul = Character.getNumericValue(A.charAt(i));
      int carry = 0;
      for (int j = bLength - 1; j >= 0; j--) {
        int val = values[currIdx] + carry + Character.getNumericValue(B.charAt(j)) * mul;
        carry = val > 9 ? val / 10 : 0;
        val = val > 9 ? val % 10 : val;
        values[currIdx--] = val;
      }
      while (carry > 0) {
        int val = carry + values[currIdx];
        carry = val > 9 ? val / 10 : 0;
        val = val > 9 ? val % 10 : val;
        values[currIdx--] = val;
      }
      idx--;
    }
    idx = 0;
    while (idx < values.length && values[idx] == 0) {
      idx++;
    }
    StringBuilder sb = new StringBuilder();
    while (idx < values.length) {
      sb.append(values[idx++]);
    }
    return sb.length() > 0 ? sb.toString() : "0";
  }
}


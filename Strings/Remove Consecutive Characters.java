public class Solution {
  public String solve(String A, int B) {
    StringBuilder sb = new StringBuilder();
    int idx = 0;
    int n = A.length();
    while (idx < n) {
      char c = A.charAt(idx);
      int start = idx;
      int count = 0;
      while (idx < n && A.charAt(idx) == c) {
        idx++;
        count++;
      }
      if (count != B) {
        sb.append(A.substring(start, idx));
      }
    }
    return sb.toString();
  }
}

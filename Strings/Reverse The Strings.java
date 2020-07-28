public class Solution {
  public String solve(String A) {
    int idx = A.length() - 1;
    StringBuilder sb = new StringBuilder();
    while (idx >= 0 && A.charAt(idx) == ' ') {
      idx--;
    }
    StringBuilder temp = new StringBuilder();
    while (idx >= 0) {
      if (A.charAt(idx) == ' ') {
        if (temp.length() > 0) {
          sb.append(temp.reverse().toString()).append(" ");
          temp.setLength(0);
        }
      }
      else {
        temp.append(A.charAt(idx));
      }
      idx--;
    }
    if (temp.length() > 0) {
      sb.append(temp.reverse().toString());
    }
    return sb.toString().trim();
  }
}


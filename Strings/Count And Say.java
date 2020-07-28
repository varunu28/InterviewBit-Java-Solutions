public class Solution {
  public String countAndSay(int n) {
    int curr = 1;
    String str = "1";
    while (curr != n) {
      StringBuilder sb = new StringBuilder();
      int idx = 0;
      int length = str.length();
      while (idx < length) {
        char c = str.charAt(idx);
        int count = 0;
        while (idx < length && str.charAt(idx) == c) {
          idx++;
          count++;
        }
        sb.append(count).append(c);
      }
      str = sb.toString();
      curr++;
    }
    return str;
  }
}


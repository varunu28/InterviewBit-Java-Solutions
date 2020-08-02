public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public int strStr(final String A, final String B) {
    int lenA = A.length();
    int lenB = B.length();
    if (lenB > lenA) {
      return -1;
    }
    for (int i = 0; i <= lenA - lenB; i++) {
      if (A.substring(i, i + lenB).equals(B)) {
        return i;
      }
    }
    return -1;
  }
}

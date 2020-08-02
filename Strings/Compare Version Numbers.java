public class Solution {
  public int compareVersion(String A, String B) {
    String[] versionsA = A.split("\\.");
    String[] versionsB = B.split("\\.");
    int idxA = 0;
    int idxB = 0;
    while (idxA < versionsA.length && idxB < versionsB.length) {
      String versionA = getFormatted(versionsA[idxA++]);
      String versionB = getFormatted(versionsB[idxB++]);
      int compare = compareCheck(versionA, versionB);
      if (compare > 0) {
        return 1;
      }
      if (compare < 0) {
        return -1;
      }
    }
    while (idxA < versionsA.length) {
      if (!getFormatted(versionsA[idxA]).equals("")) {
        return 1;
      }
      idxA++;
    }
    while (idxB < versionsB.length && !getFormatted(versionsB[idxB]).equals("")) {
      if (!getFormatted(versionsB[idxB]).equals("")) {
        return -1;
      }
      idxB++;
    }
    return 0;
  }

  private int compareCheck(String s1, String s2) {
    if (s1.length() > s2.length()) {
      return 1;
    }
    if (s2.length() > s1.length()) {
      return -1;
    }
    int c = s1.compareTo(s2);
    return Integer.compare(c, 0);
  }

  private String getFormatted(String s) {
    int idx = 0;
    while (idx < s.length() && s.charAt(idx) == '0') {
      idx++;
    }
    return s.substring(idx);
  }
}


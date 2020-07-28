public class Solution {
  public String longestCommonPrefix(ArrayList<String> A) {
    if (A.size() == 0) {
      return "";
    }
    int minLength = Integer.MAX_VALUE;
    int minLengthIdx = 0;
    for (int i = 0; i < A.size(); i++) {
      if (A.get(i).length() < minLength) {
        minLength = A.get(i).length();
        minLengthIdx = i;
      }
    }
    String targetStr = A.get(minLengthIdx);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < targetStr.length(); i++) {
      boolean mismatch = false;
      for (String str : A) {
        if (str.charAt(i) != targetStr.charAt(i)) {
          mismatch = true;
          break;
        }
      }
      if (mismatch) {
        break;
      }
      sb.append(targetStr.charAt(i));
    }
    return sb.length() == 0 ? "" : sb.toString();
  }
}


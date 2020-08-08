public class Solution {
  public int lengthOfLongestSubstring(String A) {
    int maxLength = 0;
    int start = 0;
    int end = 0;
    int n = A.length();
    Map<Character, Integer> map = new HashMap<>();
    while (end < n) {
      char c = A.charAt(end);
      map.put(c, map.getOrDefault(c, 0) + 1);
      while (map.get(c) > 1) {
        map.put(A.charAt(start), map.get(A.charAt(start)) - 1);
        start++;
      }
      end++;
      maxLength = Math.max(maxLength, end - start);
    }
    return maxLength;
  }
}

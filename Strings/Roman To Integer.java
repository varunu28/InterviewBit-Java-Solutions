public class Solution {
  public int romanToInt(String A) {
    String[] keys = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < keys.length; i++) {
      map.put(keys[i], values[i]);
    }
    int idx = 0;
    int n = A.length();
    int sum = 0;
    while (idx < n) {
      if (idx + 1 < n && map.containsKey(A.substring(idx, idx + 2))) {
        sum += map.get(A.substring(idx, idx + 2));
        idx++;
      }
      else {
        sum += map.get(String.valueOf(A.charAt(idx)));
      }
      idx++;
    }
    return sum;
  }
}


public class Solution {
  public int colorful(int A) {
    Set<Integer> set = new HashSet<>();
    String s = String.valueOf(A);
    for (int i = 0; i < s.length(); i++) {
      int prod = 1;
      for (int j = i; j < s.length(); j++) {
        prod *= Character.getNumericValue(s.charAt(j));
        if (set.contains(prod)) {
          return 0;
        }
        set.add(prod);
      }
    }
    return 1;
  }
}


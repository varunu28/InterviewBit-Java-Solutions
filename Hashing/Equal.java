public class Solution {
  public ArrayList<Integer> equal(ArrayList<Integer> A) {
    Map<Integer, int[]> map = new HashMap<>();
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    for (int i = 0; i < A.size(); i++) {
      for (int j = i + 1; j < A.size(); j++) {
        int sum = A.get(i) + A.get(j);
        if (map.containsKey(sum)) {
          int[] match = map.get(sum);
          int a = match[0];
          int b = match[1];
          int c = i;
          int d = j;
          if (a < b && c < d && a < c && b != d && b != c) {
            ans.add(new ArrayList<>(Arrays.asList(a, b, c, d)));
          }
        }
        map.putIfAbsent(sum, new int[]{i, j});
      }
    }
    ans.sort(
        Comparator.comparingInt((ArrayList<Integer> o) -> o.get(0)).thenComparingInt(o -> o.get(1))
            .thenComparingInt(o -> o.get(2)).thenComparingInt(o -> o.get(3)));
    return ans.size() == 0 ? new ArrayList<>() : ans.get(0);
  }
}


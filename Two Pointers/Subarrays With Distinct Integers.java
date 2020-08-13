public class Solution {
  public int solve(ArrayList<Integer> A, int B) {
    return atMostK(A, B) - atMostK(A, B - 1);
  }
  
  private int atMostK(ArrayList<Integer> A, int K) {
    int start = 0;
    int end = 0;
    int n = A.size();
    Map<Integer, Integer> map = new HashMap<>();
    int count = 0;
    while (end < n) {
      if (map.getOrDefault(A.get(end), 0) == 0) {
        K--;
      }
      map.put(A.get(end), map.getOrDefault(A.get(end), 0) + 1);
      while (K < 0) {
        map.put(A.get(start), map.getOrDefault(A.get(start), 0) - 1);
        if (map.get(A.get(start)) == 0) {
          K++;
        }
        start++;
      }
      count += end - start + 1;
      end++;
    }
    return count;
  }
}


public class Solution {
  public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
    int n = A.size();
    if (B > n) {
      return new ArrayList<Integer>();
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < B - 1; i++) {
      map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);
    }
    ArrayList<Integer> list = new ArrayList<>();
    int start = 0;
    for (int i = B - 1; i < n; i++) {
      map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);
      list.add(map.size());
      map.put(A.get(start), map.getOrDefault(A.get(start), 0) - 1);
      if (map.get(A.get(start)) <= 0) {
        map.remove(A.get(start));
      }
      start++;
    }
    return list;
  }
}

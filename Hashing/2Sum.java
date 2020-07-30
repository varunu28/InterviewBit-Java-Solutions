public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
    Map<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < A.size(); i++) {
      if (map.containsKey(B - A.get(i))) {
        list.add(map.get(B - A.get(i)));
        list.add(i + 1);
        break;
      }
      map.putIfAbsent(A.get(i), i + 1);
    }
    return list;
  }
}


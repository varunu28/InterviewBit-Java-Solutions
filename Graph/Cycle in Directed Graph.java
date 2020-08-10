public class Solution {
  private final int START = 1;
  private final int VISITING = 2;
  private final int END = 2;
  public int solve(int A, ArrayList<ArrayList<Integer>> B) {
    Map<Integer, List<Integer>> map = new HashMap<>();
    for (ArrayList<Integer> connection : B) {
      map.computeIfAbsent(connection.get(0), k -> new ArrayList<>()).add(connection.get(1));
    }
    Map<Integer, Integer> state = new HashMap<>();
    for (int i = 1; i <= A; i++) {
      state.put(i, START);
    }
    for (int i = 1; i <= A; i++) {
      if (state.get(i) != END && isCycle(map, state, i)) {
        return 1;
      }
    }
    return 0;
  }

  private boolean isCycle(Map<Integer, List<Integer>> map, Map<Integer, Integer> state, int curr) {
    if (state.get(curr) == VISITING) {
      return true;
    }
    state.put(curr, VISITING);
    for (Integer connected : map.getOrDefault(curr, new ArrayList<>())) {
      if (isCycle(map, state, connected)) {
        return true;
      }
    }
    state.put(curr, END);
    return false;
  }
}

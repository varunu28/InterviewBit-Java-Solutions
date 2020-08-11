public class Solution {
  public int solve(int A, ArrayList<ArrayList<Integer>> B) {
    Map<Integer, List<Integer>> map = new HashMap<>();
    for (ArrayList<Integer> connection : B) {
      map.computeIfAbsent(connection.get(0), k -> new ArrayList<>()).add(connection.get(1));
      map.computeIfAbsent(connection.get(1), k -> new ArrayList<>()).add(connection.get(0));
    }
    Map<Integer, Integer> state = new HashMap<>();
    for (int i = 1; i <= A; i++) {
      state.put(i, -1);
    }
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 1; i <= A; i++) {
      if (state.get(i) == -1) {
        queue.add(i);
        state.put(i, 0);
        while (!queue.isEmpty()) {
          int removed = queue.remove();
          state.put(removed, 1);
          for (Integer neighbor : map.getOrDefault(removed, new ArrayList<>())) {
            if (state.get(neighbor) == -1) {
              queue.add(neighbor);
              state.put(neighbor, 0);
            }
            else if (state.get(neighbor) == 0) {
              return 1;
            }
          }
        }
      }
    }
    return 0;
  }
}


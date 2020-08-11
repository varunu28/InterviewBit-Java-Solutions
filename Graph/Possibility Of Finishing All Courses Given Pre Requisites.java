public class Solution {
  public int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {
    Map<Integer, Set<Integer>> map = new HashMap<>();
    Map<Integer, Integer> indegree = new HashMap<>();
    for (int i = 0; i < B.size(); i++) {
      map.computeIfAbsent(B.get(i), k -> new HashSet<>()).add(C.get(i));
      indegree.put(C.get(i), indegree.getOrDefault(C.get(i), 0) + 1);
    }
    Queue<Integer> queue = new LinkedList<>();
    Set<Integer> coursesTaken = new HashSet<>();
    for (int i = 1; i <= A; i++) {
      if (!indegree.containsKey(i)) {
        queue.add(i);
        coursesTaken.add(i);
      }
    }
    while (!queue.isEmpty()) {
      int removed = queue.remove();
      for (Integer dependent : map.getOrDefault(removed, new HashSet<>())) {
        if (!coursesTaken.contains(dependent)) {
          indegree.put(dependent, indegree.get(dependent) - 1);
          if (indegree.get(dependent) == 0) {
            coursesTaken.add(dependent);
            queue.add(dependent);
          }
        }
      }
    }
    return coursesTaken.size() == A ? 1 : 0;
  }
}


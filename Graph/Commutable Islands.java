public class Solution {
  public int solve(int A, ArrayList<ArrayList<Integer>> B) {
    B.sort(Comparator.comparingInt(o -> o.get(2)));
    int[] parent = new int[A];
    Arrays.fill(parent, -1);
    int ans = 0;
    for (ArrayList<Integer> bridge : B) {
      int parentOne = findParent(parent, bridge.get(0) - 1);
      int parentTwo = findParent(parent, bridge.get(1) - 1);
      if (parentOne != parentTwo) {
        union(parent, parentOne, parentTwo);
        ans += bridge.get(2);
      }
    }
    return ans;
  }

  private void union(int[] parent, int x, int y) {
    int parentOne = findParent(parent, x);
    int parentTwo = findParent(parent, y);
    parent[parentOne] = parentTwo;
  }

  private int findParent(int[] parent, int i) {
    if (parent[i] == -1) {
      return i;
    }
    return findParent(parent, parent[i]);
  }
}


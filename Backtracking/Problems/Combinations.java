public class Solution {
  public ArrayList<ArrayList<Integer>> combine(int A, int B) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    helper(ans, A, 1, B, new ArrayList<>());
    return ans;
  }

  private void helper(ArrayList<ArrayList<Integer>> ans, int a, int idx, int b, ArrayList<Integer> curr) {
    if (curr.size() >= b) {
      if (curr.size() == b) {
        ans.add(new ArrayList<>(curr));
      }
      return;
    }
    for (int i = idx; i <= a; i++) {
      curr.add(i);
      helper(ans, a, i + 1, b, curr);
      curr.remove(curr.size() - 1);
    }
  }
}


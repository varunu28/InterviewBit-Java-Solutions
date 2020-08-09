public class Solution {
  public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    Collections.sort(A);
    helper(A, ans, new ArrayList<>(), B, 0);
    return new ArrayList<>(ans);
  }

  private void helper(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr, int b, int idx) {
    if (b < 0) {
      return;
    }
    if (b == 0) {
      if(!ans.contains(curr)) {
        ans.add(new ArrayList<>(curr));
      }
      return;
    }
    for (int i = idx; i < a.size(); i++) {
      curr.add(a.get(i));
      helper(a, ans, curr, b - a.get(i), i);
      curr.remove(curr.size() - 1);
    }
  }
}

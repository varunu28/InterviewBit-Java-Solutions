public class Solution {
  public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    Collections.sort(A);
    helper(A, ans, new ArrayList<>(), 0);
    return ans;
  }

  private void helper(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr, int idx) {
    ans.add(new ArrayList<>(curr));
    for (int i = idx; i < A.size(); i++) {
      curr.add(A.get(i));
      helper(A, ans, curr, i + 1);
      curr.remove(curr.size() - 1);
    }
  }
}


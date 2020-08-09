public class Solution {
  public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
    Collections.sort(a);
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    helper(a, ans, new ArrayList<>(), b, 0);
    return new ArrayList<>(ans);
  }

  private void helper(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr, int b, int idx) {
    if (b == 0) {
      ans.add(new ArrayList<>(curr));
    }
    else if (b < 0 || idx == a.size()) {
      return;
    }
    else {
      for (int i = idx; i < a.size(); i++) {
        if (i > idx && a.get(i).equals(a.get(i - 1))) {
          continue;
        }
        curr.add(a.get(i));
        helper(a, ans, curr, b - a.get(i), i + 1);
        curr.remove(curr.size() - 1);
      }
    }
  }
}


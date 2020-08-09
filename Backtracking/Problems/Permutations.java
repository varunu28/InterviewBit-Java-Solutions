public class Solution {
  public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    helper(A, ans, new ArrayList<Integer>(), new HashSet<>());
    return ans;
  }

  private void helper(ArrayList<Integer> A,  ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr, Set<Integer> set) {
    if (curr.size() == A.size()) {
      ans.add(new ArrayList<>(curr));
    }
    else {
      for (int i = 0; i < A.size(); i++) {
        if (!set.contains(A.get(i))) {
          set.add(A.get(i));
          curr.add(A.get(i));
          helper(A, ans, curr, set);
          curr.remove(curr.size() - 1);
          set.remove(A.get(i));
        }
      }
    }
  }
}


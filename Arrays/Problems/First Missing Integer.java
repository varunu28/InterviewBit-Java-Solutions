public class Solution {
  public int firstMissingPositive(ArrayList<Integer> A) {
    int n = A.size();
    int idx = 0;
    while (idx < n) {
      if (A.get(idx) == (idx + 1) || A.get(idx) <= 0 || A.get(idx) > n) {
        idx++;
        continue;
      }
      int idx1 = idx;
      int idx2 = A.get(idx) - 1;
      if (A.get(idx2) != A.get(idx1)) {
        int temp = A.get(idx1);
        A.set(idx1, A.get(idx2));
        A.set(idx2, temp);
      }
      else {
        idx++;
      }
    }
    idx = 0;
    while (idx < n && A.get(idx) == idx + 1) {
      idx++;
    }
    return idx + 1;
  }
}

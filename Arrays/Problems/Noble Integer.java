public class Solution {
  public int solve(ArrayList<Integer> A) {
    Collections.sort(A);
    int idx = 0;
    int n = A.size();
    while (idx < n){
      int num = A.get(idx);
      while (idx < n && A.get(idx) == num) {
        idx++;
      }
      if (num == A.size() - idx) {
        return 1;
      }
    }
    return -1;
  }
}


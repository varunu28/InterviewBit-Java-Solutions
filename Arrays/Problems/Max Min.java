public class Solution {
  public int solve(ArrayList<Integer> A) {
    int n = A.size();
    int idx = 0;
    int max = 0;
    int min = 0;
    if (n == 1) {
      return A.get(0) * 2;
    }
    if (n == 2) {
      return A.get(0) + A.get(1);
    }
    if (n % 2 != 0) {
      max = A.get(0) > A.get(1) ? A.get(0) : A.get(1);
      min = A.get(0) > A.get(1) ? A.get(1) : A.get(0);
      idx = 2;
    }
    else {
      max = A.get(0);
      min = A.get(0);
      idx = 1;
    }
    while (idx < n - 1) {
      if (A.get(idx) > A.get(idx + 1)) {
        if (A.get(idx) > max) {
          max = A.get(idx);
        }
        if (A.get(idx + 1) < min) {
          min = A.get(idx + 1);
        }
      }
      else {
        if (A.get(idx + 1) > max) {
          max = A.get(idx + 1);
        }
        if (A.get(idx) < min) {
          min = A.get(idx);
        }
      }
      idx += 2;
    }
    return max + min;
  }
}

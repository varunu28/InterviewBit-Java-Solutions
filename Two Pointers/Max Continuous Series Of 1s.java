public class Solution {
  public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
    int start = 0;
    int len = A.size();
    int p1 = 0;
    int p2 = 0;
    int zeros = B;
    int lastZero = -1;
    int[] ans = new int[2];

    int maxLen = Integer.MIN_VALUE;

    while (start < len) {
      if (A.get(start).equals(0)) {
        if (lastZero == -1) {
          lastZero = start;
        }
        if (zeros == 0) {
          if (maxLen < (p2-p1)) {
            ans[0] = p1;
            ans[1] = p2 - 1;
            maxLen = p2 - p1;
          }
          p1 = lastZero + 1;
          start = p1;
          lastZero = -1;
          p2 = p1;
          zeros = B;
        }
        else {
          zeros--;
          start++;
          p2++;
        }
      }
      else {
        start++;
        p2++;
      }
    }

    if (maxLen < p2-p1) {
      ans[0] = p1;
      ans[1] = p2 - 1;
    }
    ArrayList<Integer> res = new ArrayList<>();
    start = ans[0];
    while (start <= ans[1]) {
      res.add(start++);
    }

    return res;
  }
}


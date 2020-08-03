public class Solution {
  public int threeSumClosest(ArrayList<Integer> A, int B) {
    Collections.sort(A);
    int closest = Integer.MAX_VALUE;
    int res = 0;
    for (int i = 0; i < A.size() - 2; i++) {
      int start = i + 1;
      int end = A.size() - 1;
      while (start < end) {
        int currSum = A.get(i) + A.get(start) + A.get(end);
        int diff = Math.abs(currSum - B);
        if (diff == 0) {
          return B;
        }
        if (diff < closest) {
          closest = diff;
          res = currSum;
        }
        if (currSum <= B) {
          start++;
        }
        else {
          end--;
        }
      }
    }
    return closest;
  }
}


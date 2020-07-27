public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public int maxSubArray(final List<Integer> A) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    for (int i = 0; i < A.size(); i++) {
      currSum += A.get(i);
      currSum = Math.max(currSum, A.get(i));
      maxSum = Math.max(maxSum, currSum);
    }
    return maxSum;
  }
}


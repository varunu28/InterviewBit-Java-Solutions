public class Solution {
  public int solve(ArrayList<Integer> A, int B) {
    int n = A.size();
    int[] prefixSum = new int[n];
    for (int i = 0; i < A.size(); i++) {
      prefixSum[i] = i == 0 ? A.get(i) : A.get(i) + prefixSum[i - 1];
    }
    int[] suffixSum = new int[n];
    for (int i = n - 1; i >= 0; i--) {
      suffixSum[i] = i == n - 1 ? A.get(i) : A.get(i) + suffixSum[i + 1];
    }
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i <= B; i++) {
      int currSum = 0;
      if (B - i > 0) {
        currSum += suffixSum[n - (B - i)];
      }
      if(i > 0){
        currSum += prefixSum[i - 1];
      }
      maxSum = Math.max(maxSum, currSum);
    }
    return maxSum;
  }
}


public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public int trap(final List<Integer> A) {
    int ans = 0;
    int left = 0;
    int right = A.size() - 1;
    int leftMax = 0;
    int rightMax = 0;
    while (left < right) {
      if (A.get(left) < A.get(right)) {
        if (A.get(left) > leftMax) {
          leftMax = A.get(left);
        }
        else {
          ans += leftMax - A.get(left);
        }
        left++;
      }
      else {
        if (A.get(right) > rightMax) {
          rightMax = A.get(right);
        }
        else {
          ans += rightMax - A.get(right);
        }
        right--;
      }
    }
    return ans;
  }
}


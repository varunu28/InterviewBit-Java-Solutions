public class Solution {
  public int maxArea(ArrayList<Integer> A) {
    int maximumArea = 0;
    int start = 0;
    int end = A.size() - 1;
    while (start < end) {
      int minHeight = Math.min(A.get(start), A.get(end));
      int currArea = minHeight * (end - start);
      maximumArea = Math.max(maximumArea, currArea);
      if (A.get(start) <= A.get(end)) {
        start++;
      }
      else {
        end--;
      }
    }
    return maximumArea;
  }
}

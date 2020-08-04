public class Solution {
  public int searchInsert(ArrayList<Integer> a, int b) {
    int start = 0;
    int end = a.size() - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (a.get(mid) == b) {
        return mid;
      }
      else if (a.get(mid) < b) {
        start = mid + 1;
      }
      else {
        end = mid - 1;
      }
    }
    return start;
  }
}

public class Solution {
  public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
    if (A.size() == 0 || A.get(0).size() == 0) {
      return 0;
    }
    int start = 0;
    int end = A.size() - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (A.get(mid).get(0) > B) {
        end = mid - 1;
      }
      else {
        int tempIdx = binarySearchHelper(A.get(mid), B);
        if (tempIdx != -1) {
          return 1;
        }
        start = mid + 1;
      }
    }
    return 0;
  }

  private int binarySearchHelper(ArrayList<Integer> A, int B) {
    int start = 0;
    int end = A.size() - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (A.get(mid) == B) {
        return mid;
      }
      else if (A.get(mid) > B) {
        end = mid - 1;
      }
      else {
        start = mid + 1;
      }
    }
    return -1;
  }
}

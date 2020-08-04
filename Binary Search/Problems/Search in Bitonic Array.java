public class Solution {
  public int solve(ArrayList<Integer> A, int B) {
    int idx = findBitonicPoint(A);
    return searchBitonic(A, B, idx);
  }

  private int searchBitonic(ArrayList<Integer> A, int B, int idx) {
    if (A.get(idx) == B) {
      return idx;
    }
    int tempIdx = ascendingBS(A, B, 0, idx - 1);
    return tempIdx != -1 ? tempIdx : descendingBS(A, B, idx + 1, A.size() - 1);
  }

  private int ascendingBS(ArrayList<Integer> A, int key, int start, int end) {
    while (start <= end) {
      int mid = (start + end) / 2;
      if (A.get(mid) == key) {
        return mid;
      }
      else if (A.get(mid) > key) {
        end = mid - 1;
      }
      else {
        start = mid + 1;
      }
    }
    return -1;
  }

  private int descendingBS(ArrayList<Integer> A, int key, int start, int end) {
    while (start <= end) {
      int mid = (start + end) / 2;
      if (A.get(mid) == key) {
        return mid;
      }
      else if (A.get(mid) < key) {
        end = mid - 1;
      }
      else {
        start = mid + 1;
      }
    }
    return -1;
  }

  private int findBitonicPoint(ArrayList<Integer> A) {
    int start = 0;
    int end = A.size() - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (A.get(mid) > A.get(mid + 1) && A.get(mid) > A.get(mid - 1)) {
        return mid;
      }
      if (A.get(mid) > A.get(mid + 1) && A.get(mid) < A.get(mid - 1)) {
        end = mid - 1;
      }
      else {
        start = mid + 1;
      }
    }
    return -1;
  }
}


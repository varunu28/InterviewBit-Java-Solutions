public class Solution {
  public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
    Collections.sort(arrive);
    Collections.sort(depart);
    int n = arrive.size();
    int currBookingCount = 1;
    int maxBookingCount = 1;
    int arriveIdx = 1;
    int departIdx = 0;
    while (arriveIdx < n && departIdx < n) {
      if (arrive.get(arriveIdx) < depart.get(departIdx)) {
        currBookingCount++;
        maxBookingCount = Math.max(maxBookingCount, currBookingCount);
        arriveIdx++;
      }
      else {
        currBookingCount--;
        departIdx++;
      }
      if (maxBookingCount > K) {
        return false;
      }
    }
    return true;
  }
}

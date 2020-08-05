public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public int repeatedNumber(final List<Integer> A) {
    int tortoise = A.get(0);
    int hare = A.get(0);
    while (true) {
      tortoise = A.get(tortoise);
      hare = A.get(A.get(hare));
      if (tortoise == hare) {
        break;
      }
    }
    int p1 = A.get(0);
    int p2 = tortoise;
    while (p1 != p2) {
      p1 = A.get(p1);
      p2 = A.get(p2);
    }
    return p1;
  }
}

public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
    int startA = 0;
    int startB = 0;
    ArrayList<Integer> list = new ArrayList<>();
    while (startA < A.size() && startB < B.size()) {
      if (A.get(startA).equals(B.get(startB))) {
        list.add(A.get(startA));
        startA++;
        startB++;
      }
      else if (A.get(startA) < B.get(startB)) {
        startA++;
      }
      else {
        startB++;
      }
    }
    return list;
  }
}

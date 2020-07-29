public class Solution {
  public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
    int idxA = 0;
    int idxB = 0;
    while (idxA < a.size() && idxB < b.size()) {
      if (a.get(idxA) > b.get(idxB)) {
        a.add(idxA, b.get(idxB));
        idxB++;
      }
      idxA++;
    }
    while (idxB < b.size()) {
      a.add(b.get(idxB++));
    }
  }
}


public class Solution {
  public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
    PriorityQueue<Index> pq = new PriorityQueue<>(new Comparator<Index>(){
      public int compare(Index i1, Index i2) {
        return A.get(i1.idx).get(i1.arrayIdx) - A.get(i2.idx).get(i2.arrayIdx);
      }
    });
    for (int i = 0; i < A.size(); i++) {
      if (A.get(i).size() > 0) {
        pq.add(new Index(i, 0));
      }
    }
    ArrayList<Integer> ans = new ArrayList<Integer>();
    while (!pq.isEmpty()) {
      Index removed =  pq.poll();
      ans.add(A.get(removed.idx).get(removed.arrayIdx));
      if (removed.arrayIdx != A.get(removed.idx).size() - 1) {
        removed.arrayIdx = removed.arrayIdx + 1;
        pq.add(removed);
      }
    }
    return ans;
  }
}


class Index {
  int idx;
  int arrayIdx;

  public Index(int idx, int arrayIdx) {
    this.idx = idx;
    this.arrayIdx = arrayIdx;
  }
}

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public String largestNumber(final List<Integer> A) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        String s1 = String.valueOf(o1);
        String s2 = String.valueOf(o2);
        String XY = s1 + s2;
        String YX = s2 + s1;
        return XY.compareTo(YX) > 0 ? -1 : 1;
      }
    });
    pq.addAll(A);
    StringBuilder sb = new StringBuilder();
    while (!pq.isEmpty()) {
      sb.append(pq.poll());
    }
    return sb.charAt(0) == '0' ? "0" :sb.toString();
  }
}


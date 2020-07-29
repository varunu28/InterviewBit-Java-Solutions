public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
    if (A.size() == 0 || B == 0) {
      return new ArrayList<>();
    }
    ArrayList<Integer> list = new ArrayList<>();
    Deque<Integer> deque = new ArrayDeque<>();
    for (int i = 0; i < A.size(); i++) {
      while (!deque.isEmpty() && deque.peekFirst() <= i - B) {
        deque.pollFirst();
      }
      while (!deque.isEmpty() && A.get(deque.peekLast()) < A.get(i)) {
        deque.pollLast();
      }
      deque.offerLast(i);
      if (i >= B - 1) {
        list.add(A.get(deque.peekFirst()));
      }
    }
    return list;
  }
}


public class Solution {
  public int removeDuplicates(ArrayList<Integer> a) {
    int start = 0;
    int end = 0;
    int n = a.size();
    while (end < n) {
      int num = a.get(end);
      while (end < n && a.get(end) == num) {
        end++;
      }
      a.set(start++, num);
    }
    return start;
  }
}


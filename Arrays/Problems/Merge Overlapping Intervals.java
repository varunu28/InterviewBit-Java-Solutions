/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
  public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
    Collections.sort(intervals, new Comparator<Interval>(){
      public int compare(Interval i1, Interval i2) {
        int c = i1.start - i2.start;
        if (c != 0) {
          return c;
        }
        return i1.end - i2.end;
      }
    });
    int idx = 0;
    int n = intervals.size();
    ArrayList<Interval> result = new ArrayList<>();
    while (idx < n) {
      Interval currInterval = intervals.get(idx);
      int currEnd = currInterval.end;
      while (idx < n && intervals.get(idx).start <= currEnd) {
        currEnd = Math.max(intervals.get(idx++).end, currEnd);
      }
      result.add(new Interval(currInterval.start, currEnd));
    }
    return result;
  }
}

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
        intervals.sort((i1,i2) -> i1.start - i2.start);

        for (int i = 0; i < intervals.size() - 1; i++) {
            Interval first = intervals.get(i);
            Interval second = intervals.get(i + 1);

            if (first.start <= second.start && first.end >= second.end) {
                intervals.remove(i + 1);
                i--;
            }

            if (second.start < first.end && first.end < second.end) {
                Interval temp = new Interval(first.start, second.end);
                intervals.remove(i + 1);
                intervals.set(i, temp);
                i--;
            }

        }

        return intervals;
    }
}

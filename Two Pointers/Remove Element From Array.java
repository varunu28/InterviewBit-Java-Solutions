public class Solution {
    public int removeElement(ArrayList<Integer> a, int b) {
        int start = 0;
        int end = 0;
        int n = a.size();
        while (end < n) {
            if (a.get(end) != b) {
                a.set(start++, a.get(end));
            }
            end++;
        }
        return start;
    }
}


public class Solution {
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int diff = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int k = 0;
        int p = A.size();
        int q = B.size();
        int r = C.size();

        while (i<p && j<q && k<r) {
            int maximum = Math.max(A.get(i), Math.max(B.get(j), C.get(k)));
            int minimum = Math.min(A.get(i), Math.min(B.get(j), C.get(k)));

            if (maximum - minimum < diff) {
                diff = maximum - minimum;
            }

            if (diff == 0) break;

            if (A.get(i) == minimum) i++;
            else if (B.get(j) == minimum) j++;
            else k++;
        }

        return diff;
    }
}

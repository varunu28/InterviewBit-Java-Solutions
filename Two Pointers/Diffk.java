public class Solution {
    public int diffPossible(ArrayList<Integer> A, int B) {
        int idx1 = 0;
        int idx2 = 1;
        int n = A.size();
        while (idx1 < n && idx2 < n) {
            if (idx1 != idx2 && A.get(idx2) - A.get(idx1) == B) {
                return 1;
            }
            if (A.get(idx2) - A.get(idx1) < B) {
                idx2++;
            }
            else {
                idx1++;
            }
        }
        return 0;
    }
}


public class Solution {
    public int trailingZeroes(int A) {
        int count = 0;
        while (A > 0) {
            count += A/5;
            A /= 5;
        }
        return count;
    }
}

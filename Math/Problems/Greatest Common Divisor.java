public class Solution {
    public int gcd(int A, int B) {
        if (B == 0) return A;
        return gcd(Math.min(A,B), Math.max(A,B)%Math.min(A, B));
    }
}

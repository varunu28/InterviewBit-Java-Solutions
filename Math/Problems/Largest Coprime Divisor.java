public class Solution {
    public int cpFact(int x, int y) {
        while (gcd(x, y) != 1) {
            x = x / gcd(x, y);
        }
        return x;
    }
    
    public int gcd(int A, int B) {
        if (B == 0) return A;
        return gcd(Math.min(A,B), Math.max(A,B)%Math.min(A, B));
    }
}

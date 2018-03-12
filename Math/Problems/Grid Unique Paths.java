public class Solution {
    public int uniquePaths(int A, int B) {
        return getUniquePaths(0, 0, A, B);
    }
    
    public int getUniquePaths(int x, int y, int A, int B) {
        if (x == A || y == B) return 0;
        if (x == A-1 && y == B-1) return 1;
        return getUniquePaths(x+1, y, A, B) + getUniquePaths(x, y+1, A, B);
    }
}

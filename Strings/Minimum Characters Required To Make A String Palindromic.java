public class Solution {
    public static int solve(String A) {
        int start = 0;
        int end = 0;
        int count = 0;
        String copy = new StringBuilder(A).reverse().toString();

        while (true) {
            if (isPalin(copy.substring(start, end)+ A)) break;
            end++;
            count++;
        }

        return count;
    }

    public static boolean isPalin(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}

public class Solution {
    static final int M = 1000003;

    int[] fs;

    void fillFactorials(int l) {
        fs = new int[l + 1];
        fs[0] = 1;
        for (int i = 1; i <= l; i++) {
            fs[i] = (fs[i - 1] * i) % M;
        }
    }

    public int findRank(String a) {
        int l = a.length();
        fillFactorials(l);

        int[] chars = new int[256];
        for (int i = 0; i < a.length(); i++) {
            byte c = (byte) a.charAt(i);
            chars[c]++;
        }

        int res = 1;
        for (int i = 0; i < l ; i++) {
            int lessThan = 0;
            for (int j = 0; j < (byte) a.charAt(i); j++) {
                lessThan += chars[j];
            }
            res += fs[l - i - 1] * lessThan % M;
            chars[a.charAt(i)] = 0;
        }
        return res % M;
    }
}

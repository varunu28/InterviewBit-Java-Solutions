public class Solution {
    public static int romanToInt(String str) {
        int res = 0;
        String roman = "IVXLCDM";
        int[] val = {1, 5, 10, 50, 100, 500, 1000};
        for (int i=0; i<str.length(); i++) {
            int s1 = val[roman.indexOf(str.charAt(i))];
            if (i+1 <str.length()) {
                int s2 = val[roman.indexOf(str.charAt(i+1))];
                if (s1 >= s2) {
                    res += s1;
                }
                else {
                    res = res + s2 - s1;
                    i++;
                }
            }
            else {
                res += s1;
                i++;
            }
        }

        return res;
    }
}

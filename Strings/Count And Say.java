public class Solution {
    public static String countAndSay(int n) {
        if(n == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder("");
        String s = "1";
        int count = 1;
        while (n > 1) {
            count = 1;
            for (int i=0; i<s.length()-1; i++) {
                if (s.charAt(i) == s.charAt(i+1)) {
                    count++;
                }
                else {
                    sb.append(String.valueOf(count)).append(s.charAt(i));
                    count = 1;
                }
            }

            if (count > 1) {
                sb.append(String.valueOf(count)).append(s.charAt(s.length()-1));
            }
            else {
                sb.append("1").append(s.charAt(s.length()-1));
            }

            s = sb.toString();
            sb.setLength(0);
            n--;
        }

        return s;
    }
}

public class Solution {
    public String convertToTitle(int col) {
        StringBuilder sb = new StringBuilder("");
        while (col > 0) {
            if (col%26 == 0) {
                sb.append("Z");
                col = col/26 - 1;
            }
            else {
                sb.append((char)(65 + col%26 - 1));
                col /= 26;
            }
        }

        return sb.reverse().toString();
    }
}

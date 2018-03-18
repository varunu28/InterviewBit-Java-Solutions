public class Solution {
    public static int atoi(final String A) {
        if (A.isEmpty()) return 0;
        String[] strs = A.split("\\s+");
        boolean signFlag = true;
        if (!strs[0].isEmpty() && strs[0].charAt(0) == '-') {
            signFlag = false;
        }

        char[] nums = strs[0].toCharArray();
        StringBuilder sb = new StringBuilder("");
        int firstChar = 0;
        
        for (char num : nums) {
            if (Character.isDigit(num)) {
                firstChar = 1;
                sb.append(num);
            }
            else if (firstChar == 0 && (num == '+' || num == '-')) {
                firstChar = 1;
                continue;
            }
            else {
                break;
            }
        }

        if (sb.length() == 0) return 0;
        int ans = 0;
        try {
            ans = Integer.parseInt(sb.toString());
            ans *= signFlag == true ? 1 : -1;
        } catch (Exception e) {
            if (signFlag) {
                ans = Integer.MAX_VALUE;
            }
            else {
                ans = Integer.MIN_VALUE;
            }
        }

        return ans;
    }
}

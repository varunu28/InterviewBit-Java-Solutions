public class Solution {
    public static ArrayList<String> prettyJSON(String A) {
        ArrayList<String> ans = new ArrayList<>();

        int openBrace = 0;
        int closedBrace = 0;
        StringBuilder sb = new StringBuilder("");
        char[] chars = A.toCharArray();
 
        for (char c : chars) {
            if ("{[".indexOf(c) != -1) {
                if (sb.length() != 0) {
                    ans.add(String.join("", Collections.nCopies(openBrace - closedBrace, "\t")) + sb.toString());
                    sb.setLength(0);
                }
                openBrace++;
                sb.append(c);
                ans.add(String.join("", Collections.nCopies(openBrace - closedBrace - 1, "\t")) + sb.toString());
                sb.setLength(0);
            }
            else if ("}]".indexOf(c) != -1) {
                if (sb.length() != 0) {
                    ans.add(String.join("", Collections.nCopies(openBrace - closedBrace, "\t")) + sb.toString());
                    sb.setLength(0);
                }
                closedBrace++;
                sb.append(c);
            }
            else if (c == ',') {
                sb.append(',');
                ans.add(String.join("", Collections.nCopies(openBrace - closedBrace, "\t")) + sb.toString());
                sb.setLength(0);
            }
            else {
                sb.append(c);
            }
        }

        if (sb.length() != 0) {
            ans.add(sb.toString());
        }

        return ans;
    }
}

public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        A.sort((s1, s2) -> s1.length() - s2.length());

        String word = A.get(0);
        return getMaxLengthWord(word, A);
    }

    public String getMaxLengthWord(String s, ArrayList<String> A) {
        while (!s.isEmpty()) {
            boolean flag = true;
            for (String str : A) {
                if (!str.startsWith(s)) {
                    flag = false;
                    break;
                }
            }

            if (flag) break;
            s = s.substring(0, s.length()-1);
        }

        return s;
    }
}

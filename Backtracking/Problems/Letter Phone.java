public class Solution {
    public static ArrayList<String> letterCombinations(String A) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "0");
        map.put(1, "1");
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        ArrayList<String> ans = new ArrayList<>();

        letterCombinationsHelper(A, ans, map, new StringBuilder(), 0);

        return ans;
    }

    private static void letterCombinationsHelper(String a, ArrayList<String> ans, Map<Integer, String> map, StringBuilder sb, int id) {
        if (id > a.length()) {
            return;
        }

        if (id == a.length() && sb.length() == a.length()) {
            ans.add(new StringBuilder(sb.toString()).toString());
        }
        else {
            for (int i=id; i<a.length(); i++) {
                String mapping = map.get(Integer.valueOf(String.valueOf(a.charAt(i))));
                for (int j=0; j<mapping.length(); j++) {
                    // Choose
                    sb.append(mapping.charAt(j));

                    // Explore
                    letterCombinationsHelper(a, ans, map, sb, i+1);

                    // Un-choose
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
    }
}


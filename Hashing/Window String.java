public class Solution {
    public String minWindow(String A, String B) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : B.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = map.size();
        int idx = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int startIdx = -1;
        int endIdx = -1;

        while (idx < A.length()) {
            if (map.containsKey(A.charAt(idx))) {
                map.put(A.charAt(idx), map.get(A.charAt(idx)) - 1);
                if (map.get(A.charAt(idx)) == 0) {
                    count--;
                }
            }

            while (start < A.length() && count == 0) {
                if (minLen > idx - start + 1) {
                    startIdx = start;
                    endIdx = idx + 1;
                    minLen = idx - start + 1;
                }
                if (map.containsKey(A.charAt(start))) {
                    map.put(A.charAt(start), map.get(A.charAt(start)) + 1);
                    if (map.get(A.charAt(start)) == 1) {
                        count++;
                    }
                }

                start++;
            }

            idx++;
        }

        return minLen == Integer.MAX_VALUE ? "" : A.substring(startIdx, endIdx);
    }
}


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int singleNumber(final List<Integer> A) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans = entry.getKey();
                break;
            }
        }

        return ans;
    }
}

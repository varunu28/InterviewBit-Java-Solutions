public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int singleNumber(final List<Integer> A) {
        int num = A.get(0);
        for (int i=1; i<A.size(); i++) {
            num ^= A.get(i);
        }
        return num;
    }
}

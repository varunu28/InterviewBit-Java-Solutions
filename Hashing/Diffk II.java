public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int diffPossible(final List<Integer> A, int B) {
        if (A.size() <= 1) return 0;
        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            if (set.contains(num + B) || set.contains(num - B)) {
                return 1;
            }
            set.add(num);
        }
        
        return 0;
    }
}

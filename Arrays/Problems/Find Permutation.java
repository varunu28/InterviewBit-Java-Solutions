public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = B;
        int min = 1;
        
        for (char c : A.toCharArray()) {
            if (c == 'D') {
                ans.add(max);
                max--;
            }
            else {
                ans.add(min);
                min++;
            }
        }
        
        ans.add(min);
        
        return ans;
    }
}

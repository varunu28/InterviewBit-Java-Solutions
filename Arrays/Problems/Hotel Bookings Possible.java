public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        
        int n = arrive.size();
        int res = 1, max = 1;
        int i = 1, j = 0;
        
        while (i < n && j < n) {
            if (arrive.get(i) < depart.get(j)) {
                ++res;
                if (res > max) {
                    max = res;
                }
                ++i;
            }
            else {
                --res;
                ++j;
            }
        }
        
        return K >= max;
    }
}

public class Solution {
    public ArrayList<Integer> getRow(int A) {
 
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> prev = new ArrayList<>();
        ans.add(1);
        if (A == 0) return ans;
        
        int count = 0;
        while (count <= A) {
            int j = 0;
            while (j <= count) {
                if (j == 0 || j == count) {
                    prev.add(1);
                }
                else {
                    prev.add(ans.get(j-1) + ans.get(j));
                }
                
                j++;
            }
            
            ans.clear();
            ans.addAll(prev);
            prev.clear();
            count++;
        }
        
        return ans;
    }
}

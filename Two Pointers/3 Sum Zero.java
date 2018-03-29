public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for (int i=0;i<A.size()-2;i++) {
            if (i > 0 && A.get(i).equals(A.get(i-1))) continue;
            
            int target = -A.get(i);
            int j = i+1;
            int k = A.size()-1;
            
            while (j<k) {
                if (A.get(j) + A.get(k) == target) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(A.get(i)); 
                    temp.add(A.get(j)); 
                    temp.add(A.get(k));
                    ans.add(temp);
                    j++;
                    k--;
                    
                    while(j<k && A.get(j) == A.get(j-1)) j++;
                    while(j<k && A.get(k) == A.get(k+1)) k--;
                }
                else if (A.get(j) + A.get(k) > target) k--;
                else {
                    j++;
                }
            }
        }
        
        return ans;
    }
}

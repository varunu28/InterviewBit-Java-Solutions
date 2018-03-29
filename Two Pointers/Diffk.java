public class Solution {
    public int diffPossible(ArrayList<Integer> A, int B) {
        for (int i=0;i<A.size(); i++) {
            for (int j=A.size()-1; i < j && j>=0;) {
                if (A.get(j) - A.get(i) > B) {
                    j--;
                } 
                else if (A.get(j) - A.get(i) == B) {
                    return 1;
                }
                else {
                    break;
                }
            }
        }
        
        return 0;
    }
}

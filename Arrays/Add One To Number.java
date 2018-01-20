public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry = 1;
        
        int i = 0;
        while (i < A.size() - 1 && A.get(i) == 0) {
            A.remove(i);
        }
        
        i = A.size() - 1;
        while (i >= 0) {
            int temp = carry + A.get(i);
            carry = temp / 10;
            temp = temp % 10;
            
            A.set(i, temp);
            
            if (carry == 0) break;
            i--;
        }
        
        if (carry > 0) {
            A.add(0, carry);
        }
        
        return A;
    }
}

public class Solution {
    public int isPalindrome(int A) {
        if(A<0) return 0;
        
        int copy = A;
        int rev = 0;
        
        while (A>0) {
            rev = rev*10 + A%10;
            A /= 10;
        }
        
        return rev == copy ? 1 : 0;
    }
}

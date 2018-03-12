class Solution {
    public int reverse(int A) {
        boolean negative = false;
        if (A < 0) {
            negative = true;
            A *= -1;
        }
        
        int rev = 0;
        int prevRev = 0;
        while (A > 0) {
            int curr = A%10;
            rev = rev*10 + curr;
            if ((rev - curr)/10 != prevRev) return 0;
            prevRev = rev;
            A /= 10;
        }
        
        return negative ? -1*rev : rev;
    }
}

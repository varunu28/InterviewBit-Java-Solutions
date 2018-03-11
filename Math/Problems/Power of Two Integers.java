public class Solution {
    public int isPower(int A) {
        if (A == 1) return 1;

        int p = 2;
        int a = 2;
        boolean flag = false;

        while (true) {
            p = 2;
            while (true){
                if (Math.pow(a, p) == A) {
                    flag = true;
                    break;
                }
                else if (Math.pow(a, p) > A) {
                    break;
                }
                p++;
            }

            a++;
            if (flag) break;
            else if (a > A){
                break;
            }
        }

        return flag ? 1 : 0;
    }
}

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int singleNumber(final List<Integer> A) {
        int sum = 0;
        for(int i = 0; i < 32; i++){
            int bitSum = 0;
            for(int j = 0; j < A.size(); j++){
                bitSum += ((A.get(j) >> i) & 1);
            }
            sum += (bitSum % 3) * Math.pow(2, i);
        }
        return sum;
    }
}

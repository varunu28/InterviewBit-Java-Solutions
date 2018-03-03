public class Solution {
    public static ArrayList<ArrayList<Integer>> generate(int A) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        if (A == 0) return arr;

        ArrayList<Integer> temp;
        int count = 0;

        while (count < A) {
            temp = new ArrayList<>();
            int j = 0;
            while (j<=count) {
                if (j == 0 || j == count) {
                    temp.add(1);
                }
                else {
                    temp.add(arr.get(count-1).get(j-1) + arr.get(count-1).get(j));
                }

                j++;
            }

            arr.add(temp);
            count++;
        }

        return arr;
    }
}

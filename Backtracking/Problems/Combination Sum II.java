public class Solution {
    public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (A.size() == 0) {
            return ans;
        }

        Collections.sort(A);
        ArrayList<Integer> temp = new ArrayList<>();
        combinationSumHelper(A, B, ans, temp, 0);

        return ans;
    }

    private static void combinationSumHelper(ArrayList<Integer> a, int b, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp, int start) {
        if (b < 0) {
            return;
        }

        if (b == 0) {
            if (!ans.contains(temp)) {
                ans.add(new ArrayList<>(temp));
            }
        }
        else {
            for (int i = start; i < a.size(); i++) {
                // Choose
                temp.add(a.get(i));

                // Explore
                combinationSumHelper(a, b - a.get(i), ans, temp, i+1);

                // Un-choose
                temp.remove(temp.size() - 1);
            }
        }
    }
}


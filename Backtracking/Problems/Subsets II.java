public class Solution {
    public static ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
        output.add(new ArrayList<Integer>());
        if (a.size() == 0) {
            return output;
        }

        Collections.sort(a);
        generate(a, output, new ArrayList<Integer>(), 0);
        return output;
    }

    private static void generate(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> output, ArrayList<Integer> temp, int index) {
        for (int i = index; i < a.size(); i++) {
            // Choose
            temp.add(a.get(i));

            if (!output.contains(temp)) {
                output.add(new ArrayList<Integer>(temp));
            }

            // Explore
            generate(a, output, temp, i+1);

            // Un-choose
            temp.remove(temp.size() - 1);
        }
    }
}


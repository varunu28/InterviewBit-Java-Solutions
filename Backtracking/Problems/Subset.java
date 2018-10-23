public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
        output.add(new ArrayList<Integer>());
        if (a.size() == 0) {
            return output;
        }
        
        Collections.sort(a);
        generate(a, output, new ArrayList<Integer>(), 0);
        return output;
    }
    
    public void generate(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> output, ArrayList<Integer> temp, int index) {
        for (int i = index; i < a.size(); i++) {
            temp.add(a.get(i));
            output.add(new ArrayList<Integer>(temp));
            generate(a, output, temp, i+1);
            temp.remove(temp.size() - 1);
        }
    }
}


public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i=0; i<A.size(); i++) {
            for (int j=0; j<A.get(i).size(); j++) {
                ArrayList<Integer> arrayList;
                if (map.containsKey(i+j)) {
                    arrayList = map.get(i+j);
                }
                else {
                    arrayList = new ArrayList<>();
                }

                arrayList.add(A.get(i).get(j));
                map.put(i+j, arrayList);
            }
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int key : map.keySet()) {
            ans.add(map.get(key));
        }

        return ans;
    }
}

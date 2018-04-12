public class Solution {
    public static ArrayList<Integer> equal(List<Integer> A) {
    	Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    	ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    	
    	for (int i=0;i<A.size();i++) {
    		for (int j=i+1;j<A.size();j++) {
    			int sum = A.get(i) + A.get(j);
    			if (map.containsKey(sum) && map.get(sum).size() == 2) {
    				int C1 = i;
    				int D1 = j;    				
    				int A1 = map.get(sum).get(0);
    				int B1 = map.get(sum).get(1);
    				
    				if (A1 < B1 && C1 < D1 && A1 < C1 && B1 != D1 && B1 != C1) {
    					ArrayList<Integer> temp = new ArrayList<>();
    					temp.add(A1);
    					temp.add(B1);
    					temp.add(C1);
    					temp.add(D1);
    					
    					ans.add(temp);
    					ArrayList<Integer> t = new ArrayList<>();
    					map.put(sum, t);
    				}
    			}
    			else if (!map.containsKey(sum)) {
    				ArrayList<Integer> temp = new ArrayList<>();
    				temp.add(i);
    				temp.add(j);
    				
    				map.put(sum, temp);
    			}
    		}
    		
    		Collections.sort(ans, new sort());
    	}
   
    	return ans.get(0);
    }
}

class sort implements Comparator<ArrayList<Integer>> {

	@Override
	public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
		int c = o1.get(0).compareTo(o2.get(0));
		if (c == 0) {
			c = o1.get(1).compareTo(o2.get(1));
		}
		if (c == 0) {
			c = o1.get(2).compareTo(o2.get(2));
		}
		if (c == 0) {
			c = o1.get(3).compareTo(o2.get(3));
		}
		
		return c;
	}
	
}

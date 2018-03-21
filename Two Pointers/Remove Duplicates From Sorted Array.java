public class Solution {
    public static int removeDuplicates(ArrayList<Integer> a) {
	    if (a.size() <= 1) return a.size();

	    int i = 1;
	    int j = 1;

	    while (i<a.size()) {
	        if (!a.get(i).equals(a.get(i - 1))) {
	            a.set(j, a.get(i));
	            j++;
	        }
	        i++;
	    }

	    ArrayList<Integer> itemsToKeep = new ArrayList<>();
	    i = 0;
	    while (i<j) {
	        itemsToKeep.add(a.get(i++));
        }

        a.clear();
	    for (int num : itemsToKeep) {
	        a.add(num);
        }

	    return a.size();
	}
}

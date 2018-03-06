public class Solution {

    public void rotate(ArrayList<ArrayList<Integer>> a) {

	    int N = a.size()-1;
	    for (int i=0;i < a.size()/2; i++) {
	        for (int j=i; j<N-i; j++) {
	            int temp1 = a.get(N-j).get(i);
	            int temp2 = a.get(N-i).get(N-j);
	            int temp3 = a.get(j).get(N-i);
	            int temp4 = a.get(i).get(j);

	            a.get(i).set(j, temp1);
	            a.get(N-j).set(i, temp2);
	            a.get(N-i).set(N-j, temp3);
	            a.get(j).set(N-i, temp4);
            }
        }
	}
}

public class Solution {
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> arr) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int m = arr.size();
        int n = arr.get(0).size();

        int T = 0;
        int B = m-1;
        int L = 0;
        int R = n-1;

        int dir = 0;

        while (T <= B && L <= R) {
            if (dir == 0) {
                for (int i=L;i<=R;i++) {
                    result.add(arr.get(T).get(i));
                }
                T++;
            }
            else if (dir == 1) {
                for (int i=T;i<=B;i++) {
                    result.add(arr.get(i).get(R));
                }
                R--;
            }
            else if (dir == 2) {
                for (int k=R;k>=L;k--) {
                    result.add(arr.get(B).get(k));
                }
                B--;
            }
            else if (dir == 3) {
                for (int k=B;k>=T;k--) {
                    result.add(arr.get(k).get(L));
                }
                L++;
            }
            dir = (dir + 1)%4;
        }
        return result;
    }
}

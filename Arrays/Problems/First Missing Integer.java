public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int i = 0;
        int n = A.size();
        while (i < n) {
            if (A.get(i) == i+1 || A.get(i) <=0 || A.get(i) > n) {
                i++;
            }
            else if (!A.get(A.get(i) - 1).equals(A.get(i))) {
                swap(A, i, A.get(i)-1);
            }
            else {
                i++;
            }
        }
        i = 0;
        while (i<n && A.get(i) == i+1) {
            i++;
        }
        return i+1;
    }

    public void swap(List<Integer> list, int id1, int id2) {
        int temp = list.get(id1);
        list.set(id1, list.get(id2));
        list.set(id2, temp);
    }
}

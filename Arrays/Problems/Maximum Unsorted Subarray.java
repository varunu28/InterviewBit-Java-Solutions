public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        int start = -1;
        int end = -1;
        int i = 0;
        int n = A.size();
        ArrayList<Integer> arr = new ArrayList<>();

        while (i < n-1) {
            if (A.get(i) > A.get(i+1)) {
                start = i;
                end = n-1;

                while (end > start) {
                    if (A.get(end) < A.get(end-1)) {
                        while (end < n-1) {
                            if (!A.get(end).equals(A.get(end + 1))) break;
                            end++;
                        }
                        break;
                    }
                    end--;
                }
                break;
            }
            i++;
        }

        if (start == -1 && end == -1) {
            arr.add(-1);
            return arr;
        }
        
        int min = A.get(start);
        int max = A.get(end);
        int minIdx = start;
        
        while (minIdx <= end) {
            min = Math.min(min, A.get(minIdx));
            max = Math.max(max, A.get(minIdx));
            minIdx++;
        }

        for (i=0;i<start; i++) {
            if (A.get(i) > min) {
                start = i;
                break;
            }
        }

        for (i=n-1; i > end; i--) {
            if (A.get(i) < max) {
                end = i;
                break;
            }
        }

        arr.add(start);
        arr.add(end);
        return arr;
    }
}

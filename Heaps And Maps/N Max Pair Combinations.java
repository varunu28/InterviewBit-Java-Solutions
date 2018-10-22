import java.util.*;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        int n = A.size();
        PriorityQueue<SumElement> pq = new PriorityQueue<>(new Comparator<SumElement>() {
            @Override
            public int compare(SumElement o1, SumElement o2) {
                return o2.sum - o1.sum;
            }
        });

        Collections.sort(A);
        Collections.sort(B);

        pq.add(new SumElement(A.get(n-1) + B.get(n-1), n-1, n-1));

        ArrayList<Integer> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        set.add(new StringBuilder().append(n-1).append("|").append(n-1).toString());

        while (n-- > 0) {
            SumElement element = pq.poll();
            ans.add(element.sum);
            if (!set.contains(new StringBuilder().append(element.ind1-1).append("|").append(element.ind2).toString())) {
                if (element.ind1-1 >= 0) {
                    pq.add(new SumElement(A.get(element.ind1 - 1) + B.get(element.ind2), element.ind1 - 1, element.ind2));
                    set.add(new StringBuilder().append(element.ind1-1).append("|").append(element.ind2).toString());
                }
            }

            if (!set.contains(new StringBuilder(element.ind1).append("|").append(element.ind2-1).toString())) {
                if (element.ind2-1 >= 0) {
                    pq.add(new SumElement(A.get(element.ind1) + B.get(element.ind2 - 1), element.ind1, element.ind2 - 1));
                    set.add(new StringBuilder(element.ind1).append("|").append(element.ind2-1).toString());
                }
            }
        }

        return ans;
    }
}

class SumElement {
    int sum;
    int ind1;
    int ind2;

    public SumElement(int sum, int ind1, int ind2) {
        this.sum = sum;
        this.ind1 = ind1;
        this.ind2 = ind2;
    }
}



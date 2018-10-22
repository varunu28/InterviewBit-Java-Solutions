public class Solution {
    public static int nchoc(int A, ArrayList<Integer> B) {
        final int MOD = 1000000007;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (Integer choc : B) {
            pq.add(choc);
        }

        long total = 0;

        while (A-- > 0) {
            int choc = pq.poll();
            total += choc;
            total %= MOD;
            pq.add(choc/2);
        }

        return (int) total;
    }
}


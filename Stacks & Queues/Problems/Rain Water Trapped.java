public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        int ans = 0, current = 0;
        Stack<Integer> st = new Stack<>();
        while (current < A.size()) {
            while (!st.empty() && A.get(current) > A.get(st.peek())) {
                int top = st.peek();
                st.pop();
                if (st.empty())
                    break;
                int distance = current - st.peek() - 1;
                int bounded_height = Math.min(A.get(current), A.get(st.peek())) - A.get(top);
                ans += distance * bounded_height;
            }
            st.push(current++);
        }
        return ans;
    }
}

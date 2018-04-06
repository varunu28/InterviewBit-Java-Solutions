public class Solution {
    Stack<Integer> st = new Stack<>();
    public int evalRPN(ArrayList<String> A) {
        int n = A.size();
        for (int i=0; i<A.size(); i++) {
            if ("*/-+".contains(A.get(i))) {
                int a = st.pop();
                int b = st.pop();
                
                if (A.get(i).equals("+")) {
                    st.push(b+a);
                }
                else if (A.get(i).equals("-")) {
                    st.push(b-a);
                }
                else if (A.get(i).equals("*")) {
                    st.push(b*a);
                }
                else {
                    st.push(b/a);
                }
            }
            else {
                st.push(Integer.parseInt(A.get(i)));
            }
        }
        
        return st.peek();
    }
}

public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int i=0; i<A.size(); i++) {
            while (!stack.isEmpty() && stack.peek() >= A.get(i)) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans.add(-1);
            }
            else {
                ans.add(stack.peek());
            }
            
            stack.push(A.get(i));
        }
        
        return ans;
    }
}

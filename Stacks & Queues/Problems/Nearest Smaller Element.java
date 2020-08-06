public class Solution {
  public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
    Stack<Integer> stack = new Stack<>();
    ArrayList<Integer> ans = new ArrayList<>();
    for (int num : A) {
      while (!stack.isEmpty() && stack.peek() >= num) {
        stack.pop();
      }
      ans.add(stack.isEmpty() ? -1 : stack.peek());
      stack.push(num);
    }
    return ans;
  }
}


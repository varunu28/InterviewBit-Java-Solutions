public class Solution {
  public ArrayList<Integer> solve(ArrayList<Integer> A) {
    Stack<Integer> stack = new Stack<>();
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = A.size() - 1; i >= 0; i--) {
      while (!stack.isEmpty() && A.get(stack.peek()) < A.get(i)) {
        stack.pop();
      }
      if (stack.isEmpty()) {
        list.add(A.get(i));
      }
      stack.push(i);
    }
    return list;
  }
}


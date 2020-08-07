public class Solution {
  public int largestRectangleArea(ArrayList<Integer> A) {
    Stack<Integer> stack = new Stack<>();
    int maxArea = 0;
    stack.push(-1);
    for (int i = 0; i < A.size(); i++) {
      while (stack.peek() != -1 && A.get(stack.peek()) >= A.get(i)) {
        maxArea = Math.max(maxArea, A.get(stack.pop()) * (i - stack.peek() - 1));
      }
      stack.push(i);
    }
    while (stack.peek() != -1) {
      maxArea = Math.max(maxArea, A.get(stack.pop()) * (A.size() - stack.peek() - 1));
    }
    return maxArea;
  }
}


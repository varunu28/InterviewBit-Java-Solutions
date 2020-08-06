public class Solution {
  public int braces(String A) {
    Stack<Character> stack = new Stack<>();
    for (char c : A.toCharArray()) {
      if (c == ')') {
        char top = stack.pop();
        if (top == '(') {
          return 1;
        }
        else {
          int count = 0;
          while (top != '(') {
            top = stack.pop();
            count++;
          }
          if (count == 1) {
            return 1;
          }
        }
      }
      else {
        stack.add(c);
      }
    }
    return 0;
  }
}

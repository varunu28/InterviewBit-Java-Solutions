public class Solution {
    public String reverseString(String A) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : A.toCharArray()) {
            stack.push(c);
        }
        
        StringBuilder sb = new StringBuilder("");
        
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        return sb.toString();
    }
}

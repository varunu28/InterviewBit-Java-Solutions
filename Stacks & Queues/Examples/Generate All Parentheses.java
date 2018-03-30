public class Solution {
    public int isValid(String A) {
        String opening = "{([";
        String closing = "})]";
        
        Stack<Character> stack = new Stack<>();
        
        for (char c : A.toCharArray()) {
            if (opening.indexOf(c) != -1) {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return 0;
                }
                char temp = stack.pop();
                if (opening.indexOf(temp) != closing.indexOf(c)) {
                    return 0;
                }
            }
        }
        
        return stack.isEmpty() == true ? 1 : 0;
    }
}

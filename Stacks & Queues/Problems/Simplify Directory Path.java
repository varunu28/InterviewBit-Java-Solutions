public class Solution {
    public static Stack<String> stack;
    
    public static String simplifyPath(String A) {
        stack = new Stack<>();
        String[] args = A.trim().split("/");
        for (String s : args) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else if(!s.isEmpty() && !s.equals(".")) {
                stack.push(s);
            }
        }
        
        StringBuilder sb = new StringBuilder("");
        while(!stack.isEmpty()) {
            sb.insert(0,stack.pop());
			sb.insert(0, "/");
        }
        
        return sb.length() != 0 ? sb.toString() : "/";
    }
}

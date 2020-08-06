public class Solution {
    public String simplifyPath(String A) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int n = A.length();
        while (idx < n) {
            if (A.charAt(idx) == '/') {
                idx++;
                while (idx < n && A.charAt(idx) != '/') {
                    sb.append(A.charAt(idx++));
                }
                String s = sb.toString();
                sb.setLength(0);
                if (s.length() > 0) {
                    if (s.equals("..") && !stack.isEmpty()) {
                        stack.pop();
                    }
                    else if (!(s.equals("..") || s.equals("."))) {
                        stack.push(s);
                    }
                }
            }
        }
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
            sb.insert(0, "/");
        }
        return sb.length() > 0 ? sb.toString() : "/";
    }
}


public class Solution {
	public long reverse(long a) {
	    StringBuilder sb = new StringBuilder(Long.toBinaryString(a));
	    sb.insert(0, String.join("", Collections.nCopies(32-sb.length(), "0")));
	    String  s = sb.reverse().toString();
	    return Long.parseLong(s, 2);
	}
}

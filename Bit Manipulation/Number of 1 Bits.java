public class Solution {
	public int numSetBits(long a) {
        String str = Long.toBinaryString(a);
        return str.length() - str.replace("1", "").length();
	}
}

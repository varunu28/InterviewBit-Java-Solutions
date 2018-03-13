import java.math.BigInteger;
public class Solution {
    public static int findRank(String perm) {
        BigInteger rank = BigInteger.ONE;
        BigInteger suffixPermCount = BigInteger.ONE;
        java.util.Map<Character, Integer> charCounts = new java.util.HashMap<Character, Integer>();
      
		for (int i = perm.length() - 1; i > -1; i--) {
            char x = perm.charAt(i);
            int xCount = charCounts.containsKey(x) ? charCounts.get(x) + 1 : 1;
            charCounts.put(x, xCount);
            for (java.util.Map.Entry<Character, Integer> e : charCounts.entrySet()) {
                if (e.getKey() < x) {
                   rank = rank.add((suffixPermCount.multiply(BigInteger.valueOf(e.getValue()))).divide(BigInteger.valueOf(xCount)));
                }
            }
            suffixPermCount = suffixPermCount.multiply(BigInteger.valueOf(perm.length() - i)).divide(BigInteger.valueOf(xCount));
        }
        
		return rank.remainder(BigInteger.valueOf(1000003)).intValue();
    }
}

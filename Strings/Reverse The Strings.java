public class Solution {
    public String reverseWords(String a) {
	    String[] arr = a.trim().split("\\s+");
	    List<String> strAns = new ArrayList<>();

	    for (int i=arr.length-1; i>=0; i--) {
	        if (!arr[i].isEmpty()) {
	            strAns.add(arr[i]);
	        }
	    }

	    String s = String.join(" ", strAns);
	    return s;
	}
}

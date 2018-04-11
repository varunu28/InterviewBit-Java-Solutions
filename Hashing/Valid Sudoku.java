public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int isValidSudoku(final List<String> A) {    	
    	for (String s : A) {
    		if(!isValid(s)) {
    			return 0;
    		}
    	}
    	
    	for (int i=0;i<9;i++) {
    		int[] count = new int[9];
    		for(String s : A) {
    			char c = s.charAt(i);
    			if (Character.isDigit(c)) {
	    			count[Character.getNumericValue(c) - 1]++;
	    			if (count[Character.getNumericValue(c) - 1] > 1) {
	    				return 0;
	    			}
    			}
    		}
    	}

    	for (int i=0;i<9;i+=3) {
    		StringBuilder[] sbs = new StringBuilder[3];
    		for(int k=0;k<3;k++) {
    			sbs[k] = new StringBuilder("");
    		}

    		for (int j=0;j<3;j++) {
    			String str = A.get(i+j);
    			sbs[0].append(str.substring(0, 3));
    			sbs[1].append(str.substring(3, 6));
    			sbs[2].append(str.substring(6, 9));
    		}
    		
    		for (int k=0;k<3;k++) {
    			if (!isValid(sbs[k].toString())) {
    				return 0;
    			}
    		}
    	}
 
	   	return 1;
    }
    
    public static boolean isValid(String s) {
    	int[] count  = new int[9];
    	for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
    			count[Character.getNumericValue(c) - 1]++;
    			if (count[Character.getNumericValue(c) - 1] > 1) {
    				return false;
    			}
			}
		}
    	return true;
    }
}

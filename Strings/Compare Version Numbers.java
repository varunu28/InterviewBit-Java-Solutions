public class Solution {
    public int compareVersion(String A, String B) {
        A = A.replaceFirst("^0*","");
        B = B.replaceFirst("^0*","");
        
        String[] arrA = A.split("\\.");
        String[] arrB = B.split("\\.");
        
        int length = Math.max(arrA.length, arrB.length);
        for (int i=0;i<length;i++) {
            if (i < arrA.length && i < arrB.length) {
                if (arrA[i].length() > arrB[i].length()) return 1;
                else if (arrA[i].length() < arrB[i].length()) return -1;
            }
            
            Long n1 = i<arrA.length ? Long.parseLong(arrA[i]) : 0;
            Long n2 = i<arrB.length ? Long.parseLong(arrB[i]) : 0;
            
            int comp = n1.compareTo(n2);
            if (comp != 0) return comp;
        }
        
        return 0;
    }
}

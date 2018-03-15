public class Solution {
    public int books(ArrayList<Integer> A, int B) {
        return findPages(A, A.size(), B);
    }
    
    public int findPages(ArrayList<Integer> A, int totalStudents, int allowedStudents) {
        long sum = 0;
        if (totalStudents < allowedStudents) return -1;
        for (int i=0; i<totalStudents; i++) {
            sum += A.get(i);
        }
        
        int start = 0;
        int end = (int)sum;
        int res = Integer.MAX_VALUE;
        
        while(start <= end) {
            int mid = (start + end)/2;
            if (isPossible(A, totalStudents, allowedStudents, mid)) {
                res = Math.min(res, mid);
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        
        return res;
    }
    
    public boolean isPossible(ArrayList<Integer> A, int totalStudents, int allowedStudents, int currMin) {
        int studentsReq = 1;
        int currSum = 0;
        
        for (int i=0; i<totalStudents; i++) {
            if (A.get(i) > currMin) {
                return false;
            }
            if (currSum + A.get(i) > currMin) {
                studentsReq++;
                currSum = A.get(i);
                if (studentsReq > allowedStudents) {
                    return false;
                }
            }
            else {
                currSum += A.get(i);
            }
        }
        
        return true;
    }
}

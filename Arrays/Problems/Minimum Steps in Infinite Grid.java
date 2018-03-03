public class Solution {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int currX = X.get(0);
        int currY = Y.get(0);
        int c = 0;
        
        for (int i=1;i<X.size();i++) {
            int x = X.get(i);
            int y = Y.get(i);
            
            c += Math.max(Math.abs(y-currY), Math.abs(x-currX));
            currY = y;
            currX = x;
        }
        return c;
    }
}

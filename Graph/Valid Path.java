public class Solution {
  int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {-1, 1}, {1, -1}, {1, 1}, {-1, -1}};
  public String solve(int A, int B, int C, int D, ArrayList<Integer> E, ArrayList<Integer> F) {
    int[][] rectangle = new int[A + 1][B + 1];
    for (int i = 0; i <= A; i++) {
      for (int j = 0; j <= B; j++) {
        for (int k = 0; k < C; k++) {
          if (Math.sqrt(Math.pow(E.get(k) - i, 2) + Math.pow(F.get(k) - j, 2)) <= D) {
            rectangle[i][j] = -1;
            break;
          }
        }
      }
    }
    if (rectangle[0][0] == -1 || rectangle[A][B] == -1) {
      return "NO";
    }
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{0, 0});
    rectangle[0][0] = -1;
    while (!queue.isEmpty()) {
      int[] removed = queue.remove();
      if (removed[0] == A && removed[1] == B) {
        return "YES";
      }
      for (int[] dir : dirs) {
        int newX = removed[0] + dir[0];
        int newY = removed[1] + dir[1];
        if (isValidPoint(rectangle, newX, newY)) {
          rectangle[newX][newY] = -1;
          queue.add(new int[]{newX, newY});
        }
      }
    }
    return "NO";
  }

  private boolean isValidPoint(int[][] rectangle, int x, int y) {
    return (
        x >= 0 && x < rectangle.length && y >= 0 && y < rectangle[0].length && rectangle[x][y] != -1
    );
  }
}

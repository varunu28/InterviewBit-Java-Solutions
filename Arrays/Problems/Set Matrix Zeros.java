public class Solution {
  public void setZeroes(ArrayList<ArrayList<Integer>> a) {
    boolean rowZero = false;
    boolean colZero = false;
    int numRows = a.size();
    int numCols = a.get(0).size();
    for (int i = 0; i < numCols; i++) {
      if (a.get(0).get(i) == 0) {
        rowZero = true;
        break;
      }
    }
    for (int i = 0; i < numRows; i++) {
      if (a.get(i).get(0) == 0) {
        colZero = true;
        break;
      }
    }
    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numCols; j++) {
        if (a.get(i).get(j) == 0) {
          a.get(i).set(0, 0);  // Make first element of row zero
          a.get(0).set(j, 0);  // Make first element of col zero
        }
      }
    }
    // Make row zero
    for (int i = 1; i < numRows; i++) {
      if (a.get(i).get(0) == 0) {
        for (int j = 0; j < numCols; j++) {
          a.get(i).set(j, 0);
        }
      }
    }
    // Make col zero
    for (int i = 1; i < numCols; i++) {
      if (a.get(0).get(i) == 0) {
        for (int j = 0; j < numRows; j++) {
          a.get(j).set(i, 0);
        }
      }
    }
    if (rowZero) {
      for (int i = 0; i < numCols; i++) {
        a.get(0).set(i, 0);
      }
    }
    if (colZero) {
      for (int i = 0; i < numRows; i++) {
        a.get(i).set(0, 0);
      }
    }
  }
}


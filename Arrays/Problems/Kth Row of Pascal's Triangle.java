public class Solution {
  public ArrayList<Integer> getRow(int A) {
    ArrayList<Integer> prev = new ArrayList<Integer>();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i <= A; i++) {
      ArrayList<Integer> temp = new ArrayList<Integer>();
      prev = list;
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          temp.add(1);
        }
        else {
          temp.add(prev.get(j - 1) + prev.get(j));
        }
      }
      list = temp;
    }
    return list;
  }
}


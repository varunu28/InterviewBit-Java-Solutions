public class Solution {
  public ArrayList<ArrayList<Integer>> solve(int A) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    if (A == 0) {
      return list;
    }
    for (int i = 0; i < A; i++) {
      ArrayList<Integer> temp = new ArrayList<>();
      for (int j = 0; j < i + 1; j++) {
        if (j == 0 || j == i) {
          temp.add(1);
        }
        else {
          temp.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
        }
      }
      list.add(temp);
    }
    return list;
  }
}


public class Solution {
  public String convert(String A, int B) {
    List<List<Character>> lists = new ArrayList<>();
    for (int i = 0; i < B; i++) {
      lists.add(new ArrayList<>());
    }
    int idx = 0;
    int dir = 1;
    for (int i = 0; i < A.length(); i++) {
      lists.get(idx).add(A.charAt(i));
      idx += dir;
      if (idx == B || idx == -1) {
        idx = dir == 1 ? Math.max(B - 2, 0) : Math.min(1, B - 1);
        dir = -dir;
      }
    }
    StringBuilder sb = new StringBuilder();
    for (List<Character> list : lists) {
      for (Character c : list) {
        sb.append(c);
      }
    }
    return sb.toString();
  }
}


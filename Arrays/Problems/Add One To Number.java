public class Solution {
  public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
    int carry = 1;
    int idx = A.size() - 1;
    while (idx >= 0) {
      int temp = A.get(idx) + carry;
      carry = temp > 9 ? 1 : 0;
      temp = temp > 9 ? temp % 10 : temp;
      A.set(idx, temp);
      if (carry == 0) {
        break;
      }
      idx--;
    }
    if (carry > 0) {
      A.add(0, carry);
    }
    ArrayList<Integer> list = new ArrayList<>();
    idx = 0;
    while (idx < A.size() && A.get(idx) == 0) {
      idx++;
    }
    while (idx < A.size()) {
      list.add(A.get(idx++));
    }
    return list;
  }
}


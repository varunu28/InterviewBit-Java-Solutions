public class Solution {
  public int solve(ArrayList<Integer> A) {
    Map<Integer, Integer> freqCounter = new HashMap<>();
    Map<Integer, Integer> indexCounter = new HashMap<>();
    for (int i = 0; i < A.size(); i++) {
      freqCounter.put(A.get(i), freqCounter.getOrDefault(A.get(i), 0) + 1);
      indexCounter.putIfAbsent(A.get(i), i);
    }
    int minRepeatingIndex = Integer.MAX_VALUE;
    for (Integer key : freqCounter.keySet()) {
      if (freqCounter.get(key) > 1) {
        minRepeatingIndex = Math.min(minRepeatingIndex, indexCounter.get(key));
      }
    }
    return minRepeatingIndex == Integer.MAX_VALUE ? -1 : A.get(minRepeatingIndex);
  }
}

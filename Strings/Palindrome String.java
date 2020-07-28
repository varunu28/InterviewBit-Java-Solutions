public class Solution {
  public int isPalindrome(String A) {
    int start = 0;
    int end = A.length() - 1;
    while (start <= end) {
      if (Character.isLetterOrDigit(A.charAt(start)) && Character.isLetterOrDigit(A.charAt(end))) {
        char c1 = Character.isLetter(A.charAt(start)) ? Character.toLowerCase(A.charAt(start)) : A.charAt(start);
        char c2 = Character.isLetter(A.charAt(end)) ? Character.toLowerCase(A.charAt(end)) : A.charAt(end);
        if (c1 != c2) {
          return 0;
        }
        start++;
        end--;
      }
      else {
        if (!Character.isLetterOrDigit(A.charAt(start))) {
          start++;
        }
        if (!Character.isLetterOrDigit(A.charAt(end))) {
          end--;
        }
      }
    }
    return 1;
  }
}


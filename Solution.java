public class Solution {
   public int minimumLength(String s) {
       if (s.length() <= 1) {
           return 0;
       }

       int left = 0;
       int right = s.length() - 1;

       while (left < right && s.charAt(left) == s.charAt(right)) {
           char currentChar = s.charAt(left);

           // Check for repeated characters on the left side
           while (left < right && s.charAt(left + 1) == currentChar) {
               left++;
           }

           // Check for repeated characters on the right side
           while (left < right && s.charAt(right - 1) == currentChar) {
               right--;
           }
       }

       // The corrected condition to calculate the result
       return (left > right) ? 0 : right - left + 1;
   }

   public static void main(String[] args) {
       Solution solution = new Solution();
       String s = "cabaabac";
       int result = solution.minimumLength(s);
       System.out.println("Output: " + result);
   }
}

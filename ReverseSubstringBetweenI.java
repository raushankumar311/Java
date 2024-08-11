import java.util.Arrays;

public class ReverseSubstringBetweenI {
   public static void main(String[] args) {
      String str = "stringipthe";

      System.out.println(reverseString(str));
   }

   public static String reverseString(String str) {
      String ans = "";

      int s = 0;
      for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == 'i') {
            for (int j = i - 1; j >= s; j--) {
               ans += str.charAt(j);
            }
            if (i + 1 < str.length()) {
               s = i + 1;
            }
         }
      }
      ans += str.substring(s);
      return ans;
   }
}
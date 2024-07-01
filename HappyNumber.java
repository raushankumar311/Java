import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
   public static void main(String[] args) {
      System.out.println(isHappy(2));
      System.out.println(isHappy(19));
   }

   public static boolean isHappy(int n) {
      Set<Integer> st = new HashSet<>();
      /*
       * This loop continues until n becomes 1 (indicating a happy number)
       * or n is found in the set (indicating a cycle)
       */
      while (n != 1 && !st.contains(n)) {
         st.add(n);
         int sum = 0;
         while (n > 0) {
            int r = n % 10;
            sum += r * r;
            n = n / 10;
         }
         n = sum; // Reassign sum to n for the next iteration
      }
      return n == 1;
   }
}

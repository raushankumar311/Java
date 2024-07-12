import java.util.Stack;

public class MaxScoreSubstring {
   static int score;

   public static void main(String[] args) {
      String s = "cdbcbbaaabab";
      int x = 4;
      int y = 5;

      score = 0;
      if (x > y) {
         s = removePairs(s, 'a', 'b', x);
         removePairs(s, 'b', 'a', y);
      } else {
         s = removePairs(s, 'b', 'a', y);
         removePairs(s, 'a', 'b', x);
      }
      System.out.println(score);
   }

   private static String removePairs(String str, char f, char l, int sc) {
      Stack<Character> st = new Stack<>();
      StringBuilder sb = new StringBuilder();
      int i = 0;
      while (i < str.length()) {
         if (!st.isEmpty() && str.charAt(i) == l && st.peek() == f) {
            st.pop();
            score += sc;
         } else {
            st.push(str.charAt(i));
         }
         i++;
      }
      while (!st.isEmpty()) {
         sb.insert(0, st.pop());
      }
      return sb.toString();
   }
}

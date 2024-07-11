import java.util.Stack;

public class ReverseSubstringBetweenParenthesis {
   public static void main(String[] args) {
      String s = "(ed(et(oc))el)";
      Stack<Character> st = new Stack<>();
      int i = 0;

      // Iterate through the string
      while (i < s.length()) {
         if (s.charAt(i) == '(' || Character.isLetter(s.charAt(i))) {
            st.push(s.charAt(i));
         } else { // Encountering a closing parenthesis
            StringBuilder temp = new StringBuilder();

            // Pop until an opening parenthesis is found
            while (!st.isEmpty() && st.peek() != '(') {
               temp.append(st.pop());
            }
            st.pop(); // Pop the opening parenthesis

            // Push the characters back to the stack in reversed order
            for (int j = 0; j < temp.length(); j++) {
               st.push(temp.charAt(j));
            }
         }
         i++;
      }

      // Build the result from the stack
      StringBuilder ans = new StringBuilder();
      while (!st.isEmpty()) {
         ans.append(st.pop());
      }

      // The characters are in reverse order, reverse them back
      System.out.println(ans.reverse().toString());
   }
}

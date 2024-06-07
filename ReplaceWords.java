import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ReplaceWords {
   public static void main(String[] args) {
      List<String> myList = Arrays.asList("a", "aa", "aaa", "aaaa");
      String sentence = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa";

      ReplaceWords rw = new ReplaceWords();
      System.out.println(rw.replaceWords(myList, sentence));
   }

   public String replaceWords(List<String> dictionary, String sentence) {
      String[] arr = sentence.split(" ");

      String finalAns = "";
      for (int i = 0; i < arr.length; i++) {
         String res = function(dictionary, arr[i]);
         if (res == "")
            finalAns += arr[i] + " ";
         else
            finalAns += res + " ";
      }
      return finalAns.trim();
   }

   private String function(List<String> dictionary, String str) {
      String ans = str; // Initialize ans with the original word

      for (String s : dictionary) {
         if (str.startsWith(s)) {
            if (s.length() < ans.length()) {
               ans = s;
            }
         }
      }
      return ans;
   }
}
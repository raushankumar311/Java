import java.util.LinkedHashMap;
import java.util.Map;

public class KthDistinctString {
   public static void main(String[] args) {
      String[] arr = {"d","b","c","b","c","a"};
      int k = 2;
      KthDistinctString obj = new KthDistinctString();
      System.out.println(obj.kthDistinct(arr, k));
   }

   public String kthDistinct(String[] arr, int k) {
      String str = "";

      LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
      for (String elements: arr) {
         hm.put(elements, hm.getOrDefault(elements, 0) + 1);
      }
      
      for (Map.Entry<String, Integer> entry : hm.entrySet()) {
         if (entry.getValue() == 1)
            k--;
         if (k == 0) {
            return entry.getKey();
         }
      }
      return str;
   }
}
import java.util.TreeMap;

public class SortPeople {
   public static void main(String[] args) {
      String[] names = { "Mary", "John", "Emma" };
      int[] heights = { 180, 165, 170 };

      String[] res = new String[names.length];
      TreeMap<Integer, String> people = new TreeMap<>();

      for (int i = 0; i < names.length; i++) {
         people.put(heights[i], names[i]);
      }
      int i = names.length - 1;
      for (String ele : people.values()) {
         res[i--] = ele;
      }

      for(String ele : res) {
         System.out.print(ele + " ");
      }
   }
}

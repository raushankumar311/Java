// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

// public class GroupAnagrams {
//    public static void main(String[] args) {
//       String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
//       GroupAnagrams obj = new GroupAnagrams();
//       List<List<String>> res = obj.groupAnagrams(strs);
//       for (List<String> row : res) {
//       System.out.println(row);
//       }
//    }

//    public List<List<String>> groupAnagrams(String[] strs) {
//       List<List<String>> ans = new ArrayList<>();
//       String[] arr = new String[strs.length];
//       for (int i = 0; i < strs.length; i++) {
//          arr[i] = sorting(strs[i]);
//       }

//       Set<String> stringSet = new HashSet<>();
//       for (int i = 0; i < arr.length; i++) {
//          stringSet.add(arr[i]);
//       }

//       for (String s : stringSet) {
//          List<String> st = new ArrayList<>();
//          for (int i = 0; i < arr.length; i++) {
//             if (s.equals(arr[i])) {
//                st.add(strs[i]);
//             }
//          }
//          ans.add(st);
//       }
//       return ans;
//    }

//    private String sorting(String str) {
//       char[] c1 = str.toCharArray();
//       Arrays.sort(c1);
//       return new String(c1);
//    }
// }


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
   public static void main(String[] args) {
      String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
      GroupAnagrams obj = new GroupAnagrams();
      List<List<String>> res = obj.groupAnagrams(strs);
      for (List<String> row : res) {
         System.out.println(row);
      }
   }

   public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> map = new HashMap<>();

      for (String str : strs) {
         String sortedStr = sorting(str);

         if (!map.containsKey(sortedStr)) {
            map.put(sortedStr, new ArrayList<>());
         }
         map.get(sortedStr).add(str);
      }

      return new ArrayList<>(map.values());
   }

   private String sorting(String str) {
      char[] c1 = str.toCharArray();
      Arrays.sort(c1);
      return new String(c1);
   }
}

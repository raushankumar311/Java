import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RelativeRank {
   public static void main(String[] args) {
      int[] score = { 10, 3, 8, 9, 4 };
      int n = score.length;
      String[] str = new String[n];

      Map<Integer, Integer> hm = new HashMap<>();
      for (int i = 0; i < n; i++) {
         hm.put(i, score[i]); //(key, value)
      }
      List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());

      // Sorting the list by values in descending order
      list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
      Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
      for (Map.Entry<Integer, Integer> entry : list) {
         sortedMap.put(entry.getKey(), entry.getValue());
      }

      String max1 = "Gold Medal";
      String max2 = "Silver Medal";
      String max3 = "Bronze Medal";

      if (sortedMap.size() == 1) {
         str[0] = max1;
         for (String s : str) {
            System.out.print(s + ",  ");
         }
      } else if (sortedMap.size() == 2) {
         int count = 0;
         for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            if (count == 0) {
               str[entry.getKey()] = max1;
               count++;
            } else {
               str[entry.getKey()] = max2;
            }
         }
         for (String s : str) {
            System.out.print(s + ",  ");
         }
      } else if (sortedMap.size() == 3) {
         int count = 0;
         for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            if (count == 0) {
               str[entry.getKey()] = max1;
               count++;
            } else if (count == 1) {
               str[entry.getKey()] = max2;
               count++;
            } else {
               str[entry.getKey()] = max3;
            }
         }
         for (String s : str) {
            System.out.print(s + ",  ");
         }
      } else {
         int count = n;
         for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            if (count == n) {
               str[entry.getKey()] = max1;
               count--;
            } else if (count == n - 1) {
               str[entry.getKey()] = max2;
               count--;
            } else if (count == n - 2) {
               str[entry.getKey()] = max3;
               count--;
            } else {
               str[entry.getKey()] = String.valueOf(n - count + 1);
               count--;
            }
         }
      }
      for (String s : str) {
         System.out.print(s + ", ");
      }
   }
}

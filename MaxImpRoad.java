// import java.util.*;

// class MaxImpRoad {
//    public static void main(String[] args) {
//       int[][] roads = { { 0, 1 } };
//       int n = 5;
//       MaxImpRoad obj = new MaxImpRoad();
//       System.out.println("Answer = " + obj.maximumImportance(n, roads));
//    }

//    public long maximumImportance(int n, int[][] roads) {
//       HashMap<Integer, Integer> hm = new HashMap<>();
//       for (int i = 0; i < roads.length; i++) {
//          for (int j = 0; j < 2; j++) {
//             int a = roads[i][j];
//             hm.put(a, hm.getOrDefault(a, 0) + 1);
//          }
//       }

//       // Extract entries into a list
//       List<Map.Entry<Integer, Integer>> eList = new ArrayList<>(hm.entrySet());

//       // Sort the list based on values
//       //Collections.sort(eList, Comparator.comparing(Map.Entry::getValue));
//       eList.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

//       // Create a new sorted HashMap
//       HashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
//       for (Map.Entry<Integer, Integer> entry : eList) {
//          sortedMap.put(entry.getKey(), entry.getValue());
//       }

//       HashMap<Integer, Integer> resMap = new HashMap<>();
//       int j = n;
//       for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
//          resMap.put(entry.getKey(), j);
//          j--;
//       }

//       long sum = 0;
//       for (int i = 0; i < roads.length; i++) {
//          int a = resMap.get(roads[i][0]);
//          int b = resMap.get(roads[i][1]);
//          //System.out.println("a = "  + a + ", b = " + b);
//          sum += a + b;
//       }
//       return sum;
//    }
// }

// 2nd approach

import java.util.*;

class MaxImpRoad {
   public static void main(String[] args) {
      int[][] roads = { { 0, 1 } };
      int n = 5;
      MaxImpRoad obj = new MaxImpRoad();
      System.out.println("Answer = " + obj.maximumImportance(n, roads));
   }

   public long maximumImportance(int n, int[][] roads) {
      // Step 1: Count the frequency of each city
      int[] freq = new int[n];
      for (int[] road : roads) {
         freq[road[0]]++;
         freq[road[1]]++;
      }

      // Step 2: Sort cities by their degrees
      Integer[] cities = new Integer[n];
      for (int i = 0; i < n; i++) {
         cities[i] = i;
      }
      Arrays.sort(cities, (a, b) -> freq[b] - freq[a]);

      // Step 3: Assign values based on sorted order
      int[] values = new int[n];
      for (int i = 0; i < n; i++) {
         values[cities[i]] = n - i;
      }

      // Step 4: Calculate total importance of all roads
      long totalImportance = 0;
      for (int[] road : roads) {
         totalImportance += values[road[0]] + values[road[1]];
      }

      return totalImportance;

   }
}
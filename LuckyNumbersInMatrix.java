import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LuckyNumbersInMatrix {
   public static void main(String[] args) {
      int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };

      List<Integer> list = new ArrayList<>();
      Set<Integer> minSet = new HashSet<>();

      // Find the minimum element in each row and add it to the set
      for (int i = 0; i < matrix.length; i++) {
         int min = Integer.MAX_VALUE;
         for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] < min) {
               min = matrix[i][j];
            }
         }
         minSet.add(min);
      }

      // Find the maximum element in each column
      for (int j = 0; j < matrix[0].length; j++) {
         int maxNum = Integer.MIN_VALUE;
         for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][j] > maxNum) {
               maxNum = matrix[i][j];
            }
         }
         // If the maximum element is also a minimum element in some row, add it to the
         // list
         if (minSet.contains(maxNum)) {
            list.add(maxNum);
         }
      }
      System.out.println(list);
   }
}

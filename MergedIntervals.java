import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergedIntervals {

   public int[][] merge(int[][] intervals) {
      if (intervals.length <= 1) {
         return intervals;
      }

      // Sort intervals based on the start time
      Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

      // Use an ArrayList to store the merged intervals
      List<int[]> merged = new ArrayList<>();

      // Initialize the first interval
      int[] currentInterval = intervals[0];
      merged.add(currentInterval);

      for (int[] interval : intervals) {
         int currentEnd = currentInterval[1];
         int nextStart = interval[0];
         int nextEnd = interval[1];

         if (currentEnd >= nextStart) {
            // There is an overlap, so we merge the intervals
            currentInterval[1] = Math.max(currentEnd, nextEnd);
         } else {
            // No overlap, add the current interval to the list and update the current
            // interval
            currentInterval = interval;
            merged.add(currentInterval);
         }
      }

      // Convert the ArrayList to a 2D array before returning
      return merged.toArray(new int[merged.size()][]);
   }

   public static void main(String[] args) {
      int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

      MergedIntervals obj = new MergedIntervals();

      int[][] mergedArray = obj.merge(intervals);
      System.out.print("{ ");
      for (int i = 0; i < mergedArray.length; i++) {
         System.out.print("{ ");
         for (int j = 0; j < 2; j++) {
            System.out.print(mergedArray[i][j]);
            if(j == 0) 
               System.out.print(", ");
         }
         System.out.print(" }");
         if(i < mergedArray.length - 1) 
            System.out.print(", ");
      }
      System.out.print(" }");

   }
}

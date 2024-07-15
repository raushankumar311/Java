import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
   public static void main(String[] args) {
      int[][] matrix = { { 1, 2, 3, 13 }, { 4, 5, 6, 14 }, { 7, 8, 9, 15 }, { 10, 11, 12, 16 }, { 17, 18, 19, 20 } };

      ArrayList<Integer> list = new ArrayList<>(); // List to store the result
      int top = 0; // Initialize the top boundary of the matrix
      int bottom = matrix.length; // Initialize the bottom boundary of the matrix
      int left = 0; // Initialize the left boundary of the matrix
      int right = matrix[0].length; // Initialize the right boundary of the matrix

      while (left < right && top < bottom) {
         // Traverse from left to right along the top row
         for (int i = left; i < right; i++) {
            list.add(matrix[top][i]);
         }
         top += 1; // Move the top boundary down

         // Traverse from top to bottom along the right column
         for (int j = top; j < bottom; j++) {
            list.add(matrix[j][right - 1]);
         }
         right -= 1; // Move the right boundary left

         // Check if the remaining submatrix is valid for further traversal
         if (!(left < right && top < bottom)) {
            break;
         }

         // Traverse from right to left along the bottom row
         for (int i = right - 1; i >= left; i--) {
            list.add(matrix[bottom - 1][i]);
         }
         bottom -= 1; // Move the bottom boundary up

         // Traverse from bottom to top along the left column
         for (int i = bottom - 1; i >= top; i--) {
            list.add(matrix[i][left]);
         }
         left += 1; // Move the left boundary right
      }

      // Print the list containing elements in spiral order
      System.out.println(list);
   }

}

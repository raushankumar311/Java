public class SpiralMatrixTwo {
   public static void main(String[] args) {
      int n = 4;
      int[][] matrix = new int[n][n];

      int top = 0, bottom = n, left = 0, right = n;
      int val = 1;
      while (top < bottom && left < right) {
         for (int i = left; i < right; i++) {
            matrix[top][i] = val;
            val++;
         }
         top++;

         for (int i = top; i < bottom; i++) {
            matrix[i][right - 1] = val;
            val++;
         }
         right--;

         if (!(top < bottom && left < right)) {
            break;
         }

         for (int i = right - 1; i >= left; i--) {
            matrix[bottom - 1][i] = val;
            val++;
         }
         bottom--;

         for (int i = bottom - 1; i >= top; i--) {
            matrix[i][left] = val;
            val++;
         }
         left++;
      }

      for(int i = 0; i < n; i++) {
         for(int j = 0; j < n; j++) {
            System.out.print(matrix[i][j] + "   ");
         }
         System.out.println();
      }
   }
}

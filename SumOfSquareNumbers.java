import java.util.Scanner;

public class SumOfSquareNumbers {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int c = sc.nextInt();
      SumOfSquareNumbers obj = new SumOfSquareNumbers();
      System.out.println(obj.judgeSquareSum(c));   
   }

   public boolean judgeSquareSum(int c) {
      int left = 0;
      int right = (int) Math.sqrt(c);

      while (left <= right) {
         long sumOfSquares = (long) left * left + (long) right * right;
         if (sumOfSquares == c) {
            return true;
         } 
         else if (sumOfSquares < c) {
            left++;
         } 
         else {
            right--;
         }
      }
      return false;
   }
}

// Time comlexity : O(square root of c)
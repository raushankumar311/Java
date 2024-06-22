import java.util.Scanner;

public class CI {
   public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);
      // System.out.print("Enter the principal amount: ");
      // double p = sc.nextDouble();
      // System.out.print("Enter the rate of interest: ");
      // double r = sc.nextDouble();
      // System.out.print("Enter the number of years: ");
      // int t = sc.nextInt();

      // double pn = p;
      // for(int i = 0; i < t; i++) {
      // double interest = Math.round((12 * p * r) / 100);
      // pn = p + interest;
      // System.out.println("Principal amount in the end of " + (i + 1) + " year = " +
      // pn + " and interest = " + interest);
      // p = pn;
      // }

      int[] customers = { 1, 0, 1, 2, 1, 1, 7, 5 };
      int[] grumpy = { 0, 1, 0, 1, 0, 1, 0, 1 };
      int minutes = 3;
      int sum = 0;
      for (int i = 0; i < customers.length; i++) {
         if (grumpy[i] == 0)
            sum += customers[i];
      }
      System.out.println("Sum = " + sum);
      int i = 0, j = 0;
      int currSum = 0;
      while (j < minutes) {
         if (grumpy[j] == 1) {
            currSum += customers[j];
         }
         j++;
      }

      int max = currSum;
      while (j < grumpy.length) {
         if (grumpy[i] == 1) {
            currSum -= customers[i];
         }
         if (grumpy[j] == 1) {
            currSum += customers[j];
         }
         i++;
         j++;
         max = Math.max(max, currSum);
         System.out.println("Max = " + max);
      }
      System.out.println("Answer = " + (max + sum));
   }
}

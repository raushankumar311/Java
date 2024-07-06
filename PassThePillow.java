import java.util.Scanner;

public class PassThePillow {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of people: ");
      int n = sc.nextInt();
      System.out.print("Enter the time: ");
      int time = sc.nextInt();

      int round = time / (n - 1);
      int remainingTime = time % (n - 1);
      if (round % 2 == 0) {
         System.out.println("After " + time + " seconds, the person who is holding the pillow = " + (remainingTime + 1));
      } else {
         System.out.println("After " + time + " seconds, the person who is holding the pillow = " + (n - remainingTime));
      }
   }
}
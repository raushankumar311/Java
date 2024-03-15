import java.util.*;
import java.util.Scanner;

class ProductExceptItself {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");  
      int n = sc.nextInt();
      System.out.print("Enter the array: ");
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
      {
         arr[i] = sc.nextInt();
      }

      int[] leftArr = new int[n];
      int[] rightArr = new int[n];

      int leftProduct = 1;
      int rightProduct = 1;

      leftArr[0] = 1;
      for(int i = 1; i < n; i++)
      {
         leftProduct = leftProduct * arr[i - 1];
         leftArr[i] = leftProduct;
      }

      rightArr[n - 1] = 1;
      for(int i = n - 2; i >= 0; i--)
      {
         rightProduct = rightProduct * arr[i + 1];
         rightArr[i] = rightProduct;
      }

      for(int i = 0; i < n; i++)
      {
         arr[i] = leftArr[i] * rightArr[i];
      }

      for(int i = 0; i < n; i++)
      {
         System.out.print(arr[i] + "  ");
      }
   }
}
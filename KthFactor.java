import java.util.*;

class KthFactor {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the value of n : ");
      int n = sc.nextInt();
      System.out.print("Enter the value of k : ");
      int k = sc.nextInt();

      KthFactor ans = new KthFactor();
      System.out.println("Kth factor of " + n + " is " + ans.factor(n, k));
   }
   public int factor(int n, int k) {
       List<Integer> arrList = new ArrayList<>();
       for(int i = 1; i <= n; i++) {
           if(n % i == 0)
               arrList.add(i); 
       }

       if (k > arrList.size()) {
           return -1; // If k is greater than the number of factors, return -1
       }
      
       return arrList.get(k - 1); // Use get instead of remove to avoid modifying the list
   }
}

public class WaterBottles {
   public static void main(String[] args) {
      int numBottles = 15;
      int numExchange = 4;
      int ans = numBottles;
      int emptyBottles = numBottles;
      while (emptyBottles >= numExchange) {
         ans += emptyBottles / numExchange;
         emptyBottles = emptyBottles / numExchange + emptyBottles % numExchange;
      }
      System.out.println(ans);
   }
}

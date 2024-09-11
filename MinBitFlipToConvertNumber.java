public class MinBitFlipToConvertNumber {
   public static void main(String[] args) {
      int start = 10, goal = 7;

      int count = 0;
      int xor = start ^ goal;
      while(xor > 0) {
         if((xor & 1) == 1) count++;
         xor /= 2;
      }
      System.out.println(count);
   }
}

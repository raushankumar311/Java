public class CountNumberOfTeams {
   public static void main(String[] args) {
      int[] rating = { 2, 5, 3, 4, 1 };
      int ans = 0;
      for (int i = 1; i < rating.length - 1; i++) {
         int middle = rating[i];
         int smallerNum = 0;
         int largerNum = 0;

         for (int left = 0; left < i; left++) {
            if (rating[left] < middle)
               smallerNum++;
         }
         for (int right = i + 1; right < rating.length; right++) {
            if (rating[right] > middle)
               largerNum++;
         }
         ans += smallerNum * largerNum;
         int largerLeft = i - smallerNum;
         int smallerRight = rating.length - 1 - i - largerNum;
         ans += largerLeft * smallerRight;
      }
      System.out.println(ans);
   }
}

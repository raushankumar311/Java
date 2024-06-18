class MaxProfitAssignment {
   public static void main(String[] args) {
      int[] difficulty = { 2, 4, 6, 8, 10 };
      int[] profit = { 10, 20, 30, 40, 50 };
      int[] worker = { 4, 5, 6, 7 };
      int n = worker.length;
      int maxProfit = 0;
      int currProfit = 0;
      for (int i = 0; i < n; i++) {
         int w = worker[i];
         int max = 0;
         for (int j = 0; j < n; j++) {
            if (difficulty[j] <= worker[i]) {
               int temp = profit[j];
               max = Math.max(max, temp);
            }
         }
         maxProfit += max;
      }
      System.out.println("Maximum profit = " + maxProfit);
   }
}
// Time complexity : O(n^2)
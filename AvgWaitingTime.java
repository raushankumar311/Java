public class AvgWaitingTime {
   public static void main(String[] args) {
      int[][] customers = { { 2, 3 }, { 6, 3 }, { 7, 5 }, { 11, 3 }, { 15, 2 }, { 18, 1 } };
      long waitingTime = customers[0][1];
      long finishTime = customers[0][0] + customers[0][1];
      for (int i = 1; i < customers.length; i++) {
         if (customers[i][0] > finishTime) {
            waitingTime += customers[i][1];
            finishTime = customers[i][0] + customers[i][1];
         } else {
            finishTime += customers[i][1];
            waitingTime += finishTime - customers[i][0];
         }
      }
      double avgWaitingTime = (double) waitingTime / customers.length;
      System.out.println(avgWaitingTime);
   }
}

// 1701. Average Waiting Time
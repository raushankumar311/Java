public class GasStation {
   public static void main(String[] args) {
      // int[] gas = { 1, 2, 3, 4, 5 };
      // int[] cost = { 3, 4, 5, 1, 2 };
      int[] gas = { 1, 2, 3 };
      int[] cost = { 3, 4, 1 };
      GasStation obj = new GasStation();
      System.out.println(obj.canCompleteCircuit(gas, cost));
   }

   public int canCompleteCircuit(int[] gas, int[] cost) {
      int totalGas = 0;
      int totalCost = 0;
      int start = 0;
      int tank = 0;

      // Iterate through each gas station
      for (int i = 0; i < gas.length; i++) {
         totalGas += gas[i];
         totalCost += cost[i];
         tank += gas[i] - cost[i];

         // If the tank is negative, it means we cannot reach this station
         if (tank < 0) {
            // Set the next station as the starting point
            start = i + 1;
            // Reset the tank
            tank = 0;
         }
      }

      /*
       * If the total gas is less than the total cost, it's impossible
       * to complete the circuit
       */
      if (totalGas < totalCost) {
         return -1;
      }

      return start;
   }

}

import java.util.HashSet;
import java.util.Set;

public class WalkingRobotSimulation {
   public static void main(String[] args) {
      int[] commands = { 4, -1, 4, -2, 4 };
      int[][] obstacles = { { 2, 4 } };
      int ans = robotSim(commands, obstacles);
      System.out.println(ans);
   }

   public static int robotSim(int[] commands, int[][] obstacles) {
      int x = 0, y = 0;
      int direction = 0; // 0 = north, 1 = east, 2 = south, 3 = west
      int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

      Set<String> obstacleSet = new HashSet<>();
      for(int[] obstacle : obstacles) {
         obstacleSet.add(obstacle[0] + "," + obstacle[1]);
      }

      int maxDistance = 0;
      for (int i = 0; i < commands.length; i++) {
         if(commands[i] == -1) {
            direction = (direction + 1) % 4;
         } else if(commands[i] == -2) {
            direction = (direction + 3) % 4;
         } else {
            for(int step = 0; step < commands[i]; step++) {
               int nextX = x + directions[direction][0];
               int nextY = y + directions[direction][1];

               if(obstacleSet.contains(nextX + "," + nextY)) {
                  break;
               }
               x = nextX;
               y = nextY;
            }
         }
         maxDistance = Math.max(maxDistance, x * x + y * y);
      }
      return maxDistance;
   }
}
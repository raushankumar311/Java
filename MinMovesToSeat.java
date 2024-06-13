import java.util.Arrays;

public class MinMovesToSeat {
   public static void main(String[] args) {
      int[] seats = {4, 1, 5, 9};
      int[] students = {1, 3, 2, 6}; 
      MinMovesToSeat obj = new MinMovesToSeat();
      
      System.out.println(obj.minMovesToSeat(seats, students));
     
   }

   public int minMovesToSeat(int[] seats, int[] students) {
      Arrays.sort(seats);
      Arrays.sort(students);

      int sum = 0;
      for(int i = 0; i < seats.length; i++) {
          sum += Math.abs(seats[i] - students[i]);
      }
      return sum;
  }
}

public class Frequency {
   public static void main(String[] args) {
       int[] array = {1, 2, 3, 4, 2, 1, 0, 5, 4, 2, 1};

       // Assuming the range of values is known (e.g., 0 to 9)
       int range = 10;

       // Create an array to store the frequency of each element
       int[] frequencyArray = new int[range];

       // Count the frequency of each element in the array
       for (int num : array) {
           frequencyArray[num]++;
       }

       // Print the frequency of each element
       for (int i = 0; i < range; i++) {
           if (frequencyArray[i] > 0) {
               System.out.println("Element: " + i + ", Frequency: " + frequencyArray[i]);
           }
       }
   }
}

public class SlidingWindow {
   public static void printFinalWindow(int[] nums, int k) {
       if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
           System.out.println("Invalid input");
           return;
       }

       int maxSum = 0;
       int currentSum = 0;
       int startIndex = 0;

       // Initialize the first window sum
       for (int i = 0; i < k; i++) {
           currentSum += nums[i];
       }

       // Move the window
       for (int i = k; i < nums.length; i++) {
           currentSum += nums[i] - nums[i - k]; // Update the window sum

           // Check and update the maximum sum
           if (currentSum > maxSum) {
               maxSum = currentSum;
               startIndex = i - k + 1; // Update the start index of the window
           }
       }
       System.out.print("Maximum sum is: " + maxSum);
       System.out.println();

       // Print the elements in the final window
       System.out.print("Elements in the final window: ");
       for (int i = startIndex; i < startIndex + k; i++) {
           System.out.print(nums[i] + " ");
       }
       System.out.println();
   }

   public static void main(String[] args) {
       int[] nums = {1, 4, 2, 10, 2, 3, 1, 0, 20};
       int k = 4;

       printFinalWindow(nums, k);
   }
}

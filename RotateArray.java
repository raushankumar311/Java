import java.util.Stack;

public class RotateArray {
   public static void main(String[] args) {
      int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
      int k = 3;
      int n = nums.length;
      k = k % n; // If k exceeded the length of the array

      reverse(nums, 0, n - 1);
      reverse(nums, 0, k - 1);
      reverse(nums, k, n - 1);

      for (int i = 0; i < nums.length; i++) {
         System.out.print(nums[i] + "  ");
      }
   }

   private static void reverse(int[] nums, int start, int end) {
      while(start < end) {
         int temp = nums[start];
         nums[start] = nums[end];
         nums[end] = temp;
         start++; end--;
      }
   }
}

// Time complexity: O(n)
// Space Complexity: O(1)
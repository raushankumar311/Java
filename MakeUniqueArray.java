import java.util.Arrays;

public class MakeUniqueArray {
   public static void main(String[] args) {
      int[] nums = {1, 1, 2, 2, 3, 7};
      Arrays.sort(nums);
      int count = 0;
      for (int i = 1; i < nums.length; i++) {
         if (nums[i] <= nums[i - 1]) {
            int curr = nums[i];
            nums[i] = nums[i - 1] + 1;
            count += nums[i] - curr;
         }
      }
      System.out.println(count);
   }
}
// Time complexity : O(nlogn)
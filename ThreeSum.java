import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ThreeSum {
   public static void main(String[] args) {
      int[] nums = { -1, 0, 1, 2, -1, -4 };
      ThreeSum obj = new ThreeSum();
      
      System.out.println(obj.threeSum(nums));
   }

   public List<List<Integer>> threeSum(int[] nums) {
      if (nums.length < 3)
         return new ArrayList<>(); /*
                                    * Not necessary to give as
                                    * per the given input coditions but a good practice to use
                                    */

      Arrays.sort(nums);
      Set<List<Integer>> twoDList = new HashSet<>();

      for (int i = 0; i < nums.length - 2; i++) {
         int l = i + 1;
         int r = nums.length - 1;
         while (l < r) {
            int sum = nums[i] + nums[l] + nums[r];
            if (sum == 0) {
               twoDList.add(Arrays.asList(nums[i], nums[l], nums[r]));
               l++;
               r--;
            } else if (sum < 0)
               l++;
            else
               r--;
         }
      }
      return new ArrayList<>(twoDList);
   }
}

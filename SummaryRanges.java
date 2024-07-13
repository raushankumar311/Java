import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) return ans;

        if (nums.length == 1) {
            ans.add(String.valueOf(nums[0]));
            return ans; // Return the list with the single element
        }

        int start = 0;
        for (int i = 1; i <= nums.length; i++) {
            // If the current number is not consecutive, or we've reached the end of the array
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (start == i - 1) {
                    // Single number range
                    ans.add(String.valueOf(nums[start]));
                } else {
                    // Range with more than one number
                    ans.add(nums[start] + "->" + nums[i - 1]);
                }
                start = i; // Set new start
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        SummaryRanges sr = new SummaryRanges();
        int[] nums = {0, 2, 3, 4, 5, 7, 8, 9, 11};
        List<String> ranges = sr.summaryRanges(nums);
        System.out.println(ranges);
    }
}

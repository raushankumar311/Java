import java.util.Arrays;

public class IntersectionOfTwoArrays {
   public static void main(String[] args) {
      int[] nums1 = { 4, 9, 5 };
      int[] nums2 = { 9, 4, 9, 8, 4 };
      IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
      int[] nums3 = obj.intersect(nums1, nums2);
      for (int num : nums3) {
         System.out.print(num + "  ");
      }
   }

   public int[] intersect(int[] nums1, int[] nums2) {
      int[] arr = new int[1001];
      int[] res = new int[1001];

      for (int num : nums1) {
         arr[num]++;
      }

      int i = 0;
      for (int num : nums2) {
         if (arr[num] > 0) {
            res[i++] = num;
            arr[num]--;
         }
      }
      return Arrays.copyOfRange(res, 0, i);
   }
}

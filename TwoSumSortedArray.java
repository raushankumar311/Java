public class TwoSumSortedArray {
   public static void main(String[] args) {
      int[] numbers = {2, 7, 11, 15};
      int target = 13;

      int l = 0, r = numbers.length - 1;
      int[] ans = new int[2];

      while(l < r) {
         int sum = numbers[l] + numbers[r];
         if(sum == target) {
            ans[0] = l + 1;
            ans[1] = r + 1;
            break;
         } 
         else if(sum < target) {
            l++;
         }
         else {
            r--;
         }
      }

      for(int e : ans) {
         System.out.print(e + "  ");
      }
   }
}

import java.util.*;

class RelativeSorting {
   public static void main(String[] args) {
      int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
      int[] arr2 = { 2, 1, 4, 3, 9, 6 };
      // Output: {2,2,2,1,4,3,3,9,6,7,19}
      RelativeSorting obj = new RelativeSorting();
      System.out.print(Arrays.toString(obj.relativeSortArray(arr1, arr2)) + "  ");
      // int arr3[] = obj.relativeSortArray(arr1, arr2);
      // for(int num : arr3) {
      //    System.out.print(num + "  ");
      // }
   }

   public int[] relativeSortArray(int[] arr1, int[] arr2) {
      int[] freq = new int[1001];
      for (int num : arr1) {
         freq[num]++;
      }
      // Place elements in arr1 according to the order in arr2
      int i = 0;
      for (int num : arr2) {
         while (freq[num] > 0) {
            arr1[i] = num;
            freq[num]--;
            i++;
         }
      }

      // Place remaining elements in ascending order
      for (int j = 0; j < freq.length; j++) {
         while (freq[j] > 0) {
            arr1[i] = j;
            freq[j]--;
            i++;
         }
      }
      return arr1;
   }
}
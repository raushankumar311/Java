public class MultipleMissingElement {
   public static void main(String[] args) {
      // Find missing elements for sorted array

      // int[] arr = {6, 7, 8, 9, 11, 12, 15, 16, 17};

      // int first = arr[0];
      // int last = arr[arr.length - 1];
      // int diff = first;

      // for(int i = 0; i < arr.length; i++) {
      //    if(diff != arr[i] - i) {
      //       // Iterate unless current difference is not equal to or less than the previous difference
      //       while(diff != arr[i] - i) {
      //          System.out.print((diff + i) + "  ");
      //          diff++;
      //       }
      //    }
      // }


      // Find missing elements for unsorted array

      int[] unsortedArray = {3, 4, 7, 9, 12, 6, 1, 11, 2, 10};

      int minNum = Integer.MAX_VALUE;
      int maxNum = Integer.MIN_VALUE;
      for(int i = 0; i < unsortedArray.length; i++) {
         if(unsortedArray[i] < minNum)
            minNum = unsortedArray[i];

         if(unsortedArray[i] > maxNum)
            maxNum = unsortedArray[i];
      }
      int[] hashArray = new int[maxNum + 1];

      for(int i = 0; i < unsortedArray.length; i++) {
         hashArray[unsortedArray[i]]++;
      }

      for(int i = minNum; i < maxNum; i++) {
         if(hashArray[i] == 0)
            System.out.print(i + " ");
      }
   }
}

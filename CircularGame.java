public class CircularGame {
   public static void main(String[] args) {
       int n = 6;
       int k = 5;
       int[] arr = new int[n];
       for (int i = 0; i < n; i++) {
           arr[i] = i + 1;
       }

       int count = 0;
       int i = 0;  // Start from the first position

       while (count < n - 1) {
           // Find the k-th person to be eliminated
           int stepCount = 0;
           while (stepCount < k) {
               if (arr[i] != -1) {
                   stepCount++;
               }
               if (stepCount < k) {
                   i = (i + 1) % n;
               }
           }

           // Eliminate the person
           arr[i] = -1;
           count++;

           // Move to the next starting position
           do {
               i = (i + 1) % n;
           } while (arr[i] == -1);
       }

       // Find the last remaining person
       for (int l = 0; l < n; l++) {
           if (arr[l] != -1) {
               System.out.println(arr[l]);
               break;
           }
       }
   }
}

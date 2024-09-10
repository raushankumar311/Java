import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class SpiralMatrixIV {
   public int[][] spiralMatrix(int m, int n, ListNode head) {
      int[][] ans = new int[m][n];

      ListNode temp = head;
      int left = 0;
      int right = n; 
      int top = 0;
      int bottom = m;

      while (left < right && top < bottom) {
          for (int i = left; i < right; i++) {
              if (temp != null) {
                  ans[top][i] = temp.val;
                  temp = temp.next;
              } else {
                  ans[top][i] = -1;
              }
          }
          top++;

          for (int i = top; i < bottom; i++) {
              if (temp != null) {
                  ans[i][right - 1] = temp.val;
                  temp = temp.next;
              } else {
                  ans[i][right - 1] = -1;
              }
          }
          right--;

          if(!(left < right && top < bottom)) {
              break;
          }

          for (int i = right - 1; i >= left; i--) {
              if (temp != null) {
                  ans[bottom - 1][i] = temp.val;
                  temp = temp.next;
              } else {
                  ans[bottom - 1][i] = -1;
              }
          }
          bottom--;

          for (int i = bottom - 1; i >= top; i--) {
              if (temp != null) {
                  ans[i][left] = temp.val;
                  temp = temp.next;
              } else {
                  ans[i][left] = -1;
              }
          }
          left++;
      }

      return ans;
  }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(0);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        int m = 3, n = 5;

        SpiralMatrixIV obj = new SpiralMatrixIV();
        int[][] ans = obj.spiralMatrix(m, n, head);

       for(int i = 0; i < ans.length; i++) {
         for(int j = 0; j < ans[0].length; j++) {
            System.out.print(ans[i][j] + "     ");
         }
         System.out.println();
       }
    }
}
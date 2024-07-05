import java.util.ArrayList;

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

public class CriticalPoints {
   public int[] nodesBetweenCriticalPoints(ListNode head) {
      if (head == null || head.next == null || head.next.next == null) {
         return new int[] { -1, -1 };
      }

      ArrayList<Integer> arrList = new ArrayList<>();

      ListNode temp1 = head;
      ListNode temp2 = head.next;
      int j = 2;
      while (temp2.next != null) {
         if (temp2.val > temp1.val && temp2.val > temp2.next.val ||
               temp2.val < temp1.val && temp2.val < temp2.next.val) {
            arrList.add(j);
         }
         j++;
         temp1 = temp1.next;
         temp2 = temp2.next;
      }
      System.out.println(arrList);
      if (arrList.size() < 2) {
         return new int[] { -1, -1 };
      }

      int maxDistance = arrList.get(arrList.size() - 1) - arrList.get(0);
      int minDistance = Integer.MAX_VALUE;
      for (int i = 1; i < arrList.size(); i++) {
         minDistance = Math.min(minDistance, arrList.get(i) - arrList.get(i - 1));
      }
      return new int[] { minDistance, maxDistance };
   }

   public static void main(String[] args) {
      ListNode head = new ListNode(5);
      head.next = new ListNode(3);
      head.next.next = new ListNode(1);
      head.next.next.next = new ListNode(2);
      head.next.next.next.next = new ListNode(5);
      head.next.next.next.next.next = new ListNode(1);
      head.next.next.next.next.next.next = new ListNode(2);

      CriticalPoints obj = new CriticalPoints();
      int[] res = obj.nodesBetweenCriticalPoints(head);

      System.out.println(res[0] + " " + res[1]);
   }
}

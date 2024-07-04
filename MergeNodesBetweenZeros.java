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

public class MergeNodesBetweenZeros {
   public static void main(String[] args) {
      ListNode head = new ListNode(0);
      head.next = new ListNode(1);
      head.next.next = new ListNode(2);
      head.next.next.next = new ListNode(0);
      head.next.next.next.next = new ListNode(2);
      head.next.next.next.next.next = new ListNode(5);
      head.next.next.next.next.next.next = new ListNode(5);
      head.next.next.next.next.next.next.next = new ListNode(0);
      head.next.next.next.next.next.next.next.next = new ListNode(3);
      head.next.next.next.next.next.next.next.next.next = new ListNode(0);
      head.next.next.next.next.next.next.next.next.next.next = new ListNode(7);
      head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(9);
      head.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);

      ListNode dummy = new ListNode(0);
      ListNode current = dummy;

      ListNode temp = head.next;

      while (temp != null) {
         int sum = 0;
         while (temp.val != 0) {
            sum += temp.val;
            temp = temp.next;
         }
         current.next = new ListNode(sum);
         current = current.next;
         temp = temp.next;
      }
      ListNode ptr = dummy.next;
      while (ptr != null) {
         System.out.print(ptr.val + " ");
         ptr = ptr.next;
      }
   }
}

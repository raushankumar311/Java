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

class InsertGCDInBetween {
   public ListNode insertGreatestCommonDivisors(ListNode head) {
      if (head.next == null)
         return head;
      ListNode temp = head;

      while (temp.next != null) {
         int a = temp.val;
         int b = temp.next.val;
         ListNode newNode = new ListNode(gcd(a, b));
         newNode.next = temp.next;
         temp.next = newNode;
         temp = newNode.next;
      }
      return head;
   }

   int gcd(int a, int b) {
      if (b == 0) {
         return a;
      }
      return gcd(b, a % b);
   }

   public static void main(String[] args) {
      ListNode head = new ListNode(18);
      head.next = new ListNode(6);
      head.next.next = new ListNode(10);
      head.next.next.next = new ListNode(3);

      InsertGCDInBetween obj = new InsertGCDInBetween();
      ListNode temp = obj.insertGreatestCommonDivisors(head);

      ListNode current = temp;
      while (current != null) {
         System.out.print(current.val);
         if (current.next != null) {
            System.out.print(" -> ");
         }
         current = current.next;
      }
   }
}

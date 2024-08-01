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

public class PartitionList {
   public static void main(String[] args) {
      ListNode head = new ListNode(1);
      head.next = new ListNode(4);
      head.next.next = new ListNode(3);
      head.next.next.next = new ListNode(2);
      head.next.next.next.next = new ListNode(5);
      head.next.next.next.next.next = new ListNode(2);
      int x = 3;

      PartitionList obj = new PartitionList();

      ListNode temp = obj.partition(head, x);
      while (temp != null) {
         System.out.print(temp.val);
         if (temp.next != null) {
            System.out.print(" -> ");
         }
         temp = temp.next;
      }
   }

   public ListNode partition(ListNode head, int x) {
      ListNode temp = head;
      // ListNode to store the node having value less than x
      ListNode first = new ListNode(0);
      ListNode first1 = first;

      // ListNode to store the node having value greater than or equal to x
      ListNode second = new ListNode(0);
      ListNode second1 = second;

      while (temp != null) {
         if (temp.val < x) {
            first1.next = new ListNode(temp.val);
            first1 = first1.next;
         } else {
            second1.next = new ListNode(temp.val);
            second1 = second1.next;
         }
         temp = temp.next;
      }
      // Merge the first and second node
      first1.next = second.next;


      return first.next;
   }
}

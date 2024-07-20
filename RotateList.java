public class RotateList {

   public ListNode rotateRight(ListNode head, int k) {
      if (head == null || k == 0) {
         return head;
      }

      // Find the length of the list
      ListNode temp = head;
      int length = 1;
      while (temp.next != null) {
         temp = temp.next;
         length++;
      }
      
      // Connect the tail to head to make it a circular list
      temp.next = head;

      // Find the new tail position: (length - k % length - 1) from the start
      int newTailPosition = length - (k % length )- 1;
      ListNode newTail = head;

      for (int i = 0; i < newTailPosition; i++) {
         newTail = newTail.next;
      }

      // The new head is the next of new tail
      ListNode newHead = newTail.next;
      newTail.next = null; // Break the circular list

      return newHead;
   }

   public static void main(String[] args) {
      ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 2;

        RotateList obj = new RotateList();
        ListNode temp = obj.rotateRight(head, k);

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

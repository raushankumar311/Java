public class ReverseNodesInGroups {

   private ListNode reverse(ListNode head, int k) {
      if (head == null || k == 1) {
         return head;
      }

      // Dummy node
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      ListNode curr = dummy, nex = dummy, pre = dummy;
      int count = 0;

      // Count the number of nodes in the linked list
      while (curr.next != null) {
         curr = curr.next;
         count++;
      }

      // Loop until we have reversed all possible k groups
      while (count >= k) {
         curr = pre.next;
         nex = curr.next;
         // Reverse k nodes
         for (int i = 1; i < k; i++) {
            curr.next = nex.next;
            nex.next = pre.next;
            pre.next = nex;
            nex = curr.next;
         }
         pre = curr;
         count -= k;
      }
      return dummy.next;
   }

   public static void main(String[] args) {
      ListNode head = new ListNode(1);
      head.next = new ListNode(2);
      head.next.next = new ListNode(3);
      head.next.next.next = new ListNode(4);
      head.next.next.next.next = new ListNode(5);
      int k = 2;

      ReverseNodesInGroups obj = new ReverseNodesInGroups();
      ListNode temp = obj.reverse(head, k);

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

class RemoveNthFromEndOfList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public int length(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = length(head);
        int nodeFromBeg = len - n + 1;
        ListNode temp = head;
        ListNode prev = null;
        if (nodeFromBeg == 1) {
            return head.next;
        }
        for (int i = 1; i < nodeFromBeg; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;
    }

    public static void main(String[] args) {
        RemoveNthFromEndOfList solution = new RemoveNthFromEndOfList();
        
        // Example linked list creation (1 -> 2 -> 3 -> 4 -> 5)
        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        // Call removeNthFromEnd method
        int n = 2;
        head = solution.removeNthFromEnd(head, n);
        
        // Print the modified linked list
        solution.printLinkedList(head);
    }

    public void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

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

class ReverseListII {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right)
            return head;

        /*
         * Create a dummy node to handle edge cases where reversing
         * includes the head node
         */
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;

        // Move `pre` to the node before the `left`-th node
        for (int i = 1; i < left; i++) {
            pre = pre.next;
        }

        // Start reversing from the `left`-th node
        ListNode start = pre.next;
        ListNode then = start.next;

        // Reverse the nodes from `left` to `right`
        for (int i = 0; i < right - left; i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int left = 2;
        int right = 4;

        ReverseListII obj = new ReverseListII();
        ListNode temp = obj.reverseBetween(head, left, right);

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
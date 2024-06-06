class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class DoubleLinkedList {

    public ListNode doubleIt(ListNode head) {
        // Convert the linked list to an integer
        ListNode temp = head;
        long sum = 0;
        while (temp != null) {
            sum = sum * 10 + temp.val;
            temp = temp.next;
        }

        // Double the sum
        sum = 2 * sum;

//        System.out.println("sum " + sum);

        // Edge case: if the sum is 0
        if (sum == 0) {
            return new ListNode(0);
        }

        long n = sum;
        int digit = 0;

        // Count the digit in number n
        while(n > 0) {
            n = n / 10;
            digit++;
        }

        // Store the digits of the n in the array
        long[] arr = new long[digit];
        int i = 0;
        while(sum > 0) {
            arr[digit - i - 1] = sum % 10;
            sum = sum / 10;
            i++;
        }

//        System.out.println();
//        for(int k = 0; k < digit; k++) {
//            System.out.print(arr[k] + " ");
//        }
//        System.out.println();

        ListNode temp1 = new ListNode();
        ListNode newHead = temp1;

        for(int j = 0; j < digit; j++) {
            temp1.val = (int)arr[j];
            if(j < digit - 1) {
                temp1.next = new ListNode();
                temp1 = temp1.next;
            }
        }
        return newHead;
    }

    // Main method to test the doubleIt function
    public static void main(String[] args) {
        // Create the input linked list: [3,4,5,4,2,5,5,9,9,9]
        ListNode head = new ListNode(3);
        head.next = new ListNode(4);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(5);


        // Print the original linked list
        System.out.print("Original list: ");
        printList(head);

        // Double the list values
        DoubleLinkedList solution = new DoubleLinkedList();
        ListNode doubledHead = solution.doubleIt(head);

        // Print the doubled linked list
        System.out.print("Doubled list: ");
        printList(doubledHead);
    }

    // Helper method to print the linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}

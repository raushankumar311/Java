/*
When are stacks used
Stacks are used whenever you need to manage a collection of items that follows the Last-In-First-Out (LIFO) order of processing.
This means that the last element added to the collection is the first one to be removed.
Stacks are commonly used in various programming scenarios, including:

Expression Evaluation: Stacks are widely used in evaluating expressions, particularly mathematical expressions.
For example, they can be used to convert infix expressions (e.g., 3 + 4 * 2) to postfix (or reverse Polish notation) expressions for easy evaluation.
Function Calls and Recursion: The call stack in C (and many other programming languages) is implemented as a stack.
When a function is called, its return address and local variables are pushed onto the call stack.
As functions return, their data is popped off the stack.
Undo/Redo Functionality: Stacks can be used to implement undo and redo functionality in applications, allowing users to revert changes they've made and redo them.
Backtracking Algorithms: Stacks are commonly used in algorithms that require backtracking, such as depth-first search, where you need to store a history of choices made to explore different paths.
Parsing and Syntax Analysis: Stacks can be used during parsing to check whether parentheses, brackets, and other symbols are balanced and properly nested.
Browser History: Stacks can be used to maintain a history of visited web pages in a browser, allowing users to navigate back through their browsing history.
Task Management: In some applications, stacks can be used to manage tasks or jobs in a way that allows the last task added to the stack to be processed next.
Memory Allocation and Deallocation: Stacks are used for managing memory allocation and deallocation in certain programming contexts.
These are just a few examples of where stacks are used. Stacks provide a simple and efficient way to manage data that follows a specific order of processing, and they are an essential concept in computer science and programming. 
*/




static final int MAX_SIZE = 101;
static int[] a = new int[MAX_SIZE];
static int top = -1;

static void push(int ele) {
    if (top <= MAX_SIZE - 1) {
        top++;
        a[top] = ele;
        System.out.println("Pushed: " + ele);
    } else {
        System.out.println("Stack is full. Cannot push: " + ele);
    }
}

static int pop() {
    if (top >= 0) {
        int ele = a[top];
        top--;
        System.out.println("Popped: " + ele);
        return ele;
    } else {
        System.out.println("Stack is empty. Cannot pop.");
        return -1;
    }
}


static int peek() {
   if (top >= 0) {
       int ele = a[top];
       System.out.println("Peeked: " + ele);
       return ele;
   } else {
       System.out.println("Stack is empty. Cannot peek.");
       return -1;
   }
}

static boolean is_empty() {
   return top == -1;
}

static boolean is_full() {
   return top >= MAX_SIZE;
}



public class stack {
   public static void main(String[] args){
      
   }
}



import java.util.LinkedList;
import java.util.Queue;

class QueueExample {
    public static void main(String[] args) {
        // Creating a queue
        Queue<Integer> myQueue = new LinkedList<>();

        // Enqueue elements
        myQueue.offer(10);
        myQueue.offer(20);
        myQueue.offer(30);

        // Displaying the front element
        System.out.println("Front element: " + myQueue.peek());

        // Displaying and removing elements
        System.out.print("Queue elements: ");
        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.poll() + " ");
        }
        System.out.println();

        // Checking if the queue is empty
        if (myQueue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is not empty.");
        }
    }
}

import java.util.Stack;

public class ReverseStack {

    // Function to reverse the stack
    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();       // Remove top
        reverse(stack);              // Reverse the rest
        insertAtBottom(stack, top);  // Insert at bottom
    }

    // Helper function to insert an element at the bottom of a stack
    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }

        int top = stack.pop();              // Pop all elements
        insertAtBottom(stack, item);        // Recursive call
        stack.push(top);                    // Push everything back
    }

    // Function to print the stack
    public static void printStack(Stack<Integer> stack) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    // Main method
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack:");
        printStack(stack);

        reverse(stack);

        System.out.println("\nReversed Stack:");
        printStack(stack);
    }
}

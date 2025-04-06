import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push all elements into the stack
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }

        // Pop elements back into the array (in reverse order)
        for (int i = 0; i < n; i++) {
            arr[i] = stack.pop();
        }

        // Print reversed array
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

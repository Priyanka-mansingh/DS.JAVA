import java.util.Scanner;

public class InsertAtAnyPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input original array size
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input original array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input new element and position
        System.out.print("Enter element to insert: ");
        int newElement = sc.nextInt();
        System.out.print("Enter position (0 to " + n + "): ");
        int pos = sc.nextInt();

        // Validate position
        if (pos < 0 || pos > n) {
            System.out.println("Invalid position!");
            return;
        }

        // Create new array
        int[] newArr = new int[n + 1];

        // Copy elements up to position
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Insert new element
        newArr[pos] = newElement;

        // Copy remaining elements
        for (int i = pos; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        // Output result
        System.out.println("Array after insertion:");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}

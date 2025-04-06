import java.util.Scanner;

public class DeleteFromUnsortedArray {

    // Function to delete an element from array
    public static int deleteElement(int[] arr, int n, int key) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == key) {
                break;
            }
        }

        if (i == n) {
            // Key not found
            System.out.println("Element not found!");
            return n;
        }

        // Shift elements to left to fill the gap
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }

        return n - 1; // New size
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[100]; // assuming max size

        // Input elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the element to delete
        System.out.print("Enter the element to delete: ");
        int key = sc.nextInt();

        // Delete operation
        n = deleteElement(arr, n, key);

        // Print result
        System.out.println("Array after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

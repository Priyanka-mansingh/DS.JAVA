import java.util.Scanner;

public class InsertInSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the sorted array
        System.out.print("Enter the number of elements in sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[100]; // assuming max size is 100

        // Input sorted array elements
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the element to insert
        System.out.print("Enter the element to insert: ");
        int key = sc.nextInt();

        // Find the correct position to insert
        int i;
        for (i = n - 1; (i >= 0 && arr[i] > key); i--) {
            arr[i + 1] = arr[i]; // shift elements to the right
        }

        // Insert the element
        arr[i + 1] = key;
        n++; // Increase array size

        // Print the updated array
        System.out.println("Array after insertion:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

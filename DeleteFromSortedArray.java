import java.util.Scanner;

public class DeleteFromSortedArray {

    // Binary search to find the index of the element
    public static int binarySearch(int[] arr, int key, int n) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }

        return -1; // Element not found
    }

    // Delete operation
    public static int deleteElement(int[] arr, int n, int key) {
        int pos = binarySearch(arr, key, n);

        if (pos == -1) {
            System.out.println("Element not found.");
            return n;
        }

        // Shift elements to the left
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return n - 1; // New size after deletion
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements in sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[100]; // Assuming max size 100

        // Input sorted array
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to delete
        System.out.print("Enter element to delete: ");
        int key = sc.nextInt();

        // Perform deletion
        n = deleteElement(arr, n, key);

        // Print array after deletion
        System.out.println("Array after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

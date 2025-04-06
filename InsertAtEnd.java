import java.util.Scanner;

public class InsertAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of original array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to insert at the end
        System.out.print("Enter the element to insert at the end: ");
        int newElement = sc.nextInt();

        // Create a new array with size + 1
        int[] newArr = new int[n + 1];

        // Copy elements from old array
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }

        // Insert new element at the end
        newArr[n] = newElement;

        // Output new array
        System.out.println("Array after insertion:");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}

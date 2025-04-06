import java.util.Scanner;

public class InsertAtBeginning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input original array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input original array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the new element to insert at the beginning
        System.out.print("Enter the element to insert at the beginning: ");
        int newElement = sc.nextInt();

        // Create a new array with size + 1
        int[] newArr = new int[n + 1];
        newArr[0] = newElement;

        // Copy old elements to new array, starting from index 1
        for (int i = 0; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print new array
        System.out.println("Array after insertion:");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}

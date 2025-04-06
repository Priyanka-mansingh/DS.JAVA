import java.util.Scanner;

public class ReverseByRotation {
    
    // Function to right rotate array by 1
    static void rightRotateByOne(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    // Function to reverse the array using rotation
    static void reverseUsingRotation(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Right rotate the array by 1, n-1 times
            rightRotateByOne(arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse using rotation
        reverseUsingRotation(arr);

        // Output reversed array
        System.out.println("Array after reverse by rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

import java.util.Scanner;

public class ReverseUsingTempArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] original = new int[n];
        int[] reversed = new int[n];

        // Input elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }

        // Reverse using temporary array
        for (int i = 0; i < n; i++) {
            reversed[i] = original[n - 1 - i];
        }

        // Print reversed array
        System.out.println("Reversed array:");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}

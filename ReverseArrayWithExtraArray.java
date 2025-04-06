import java.util.Scanner;

public class ReverseArrayWithExtraArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] original = new int[n];
        int[] reversed = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }

        // Reversing using extra array
        for (int i = 0; i < n; i++) {
            reversed[i] = original[n - 1 - i];
        }

        // Display reversed array
        System.out.println("Reversed array:");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}

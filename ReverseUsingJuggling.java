import java.util.Scanner;

public class ReverseUsingJuggling {

    // Function to compute GCD
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Function to left rotate array by d positions using Juggling Algorithm
    static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int g = gcd(d, n);

        for (int i = 0; i < g; i++) {
            int temp = arr[i];
            int j = i;

            while (true) {
                int k = j + d;
                if (k >= n) k = k - n;
                if (k == i) break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    // Function to reverse array using left rotation
    static void reverseUsingRotation(int[] arr) {
        // First reverse entire array
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse array using swap (or you can try rotating n times using leftRotate)
        reverseUsingRotation(arr);

        // Output reversed array
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

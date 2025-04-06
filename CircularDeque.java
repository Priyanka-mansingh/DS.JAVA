import java.util.Scanner;

public class CircularDeque {
    int[] deque;
    int front, rear, size;

    // Constructor
    CircularDeque(int size) {
        this.size = size;
        deque = new int[size];
        front = -1;
        rear = -1;
    }

    // Check if deque is full
    boolean isFull() {
        return ((front == 0 && rear == size - 1) || (front == rear + 1));
    }

    // Check if deque is empty
    boolean isEmpty() {
        return (front == -1);
    }

    // Insert at front
    void insertFront(int value) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front--;
        }

        deque[front] = value;
        System.out.println(value + " inserted at front");
    }

    // Insert at rear
    void insertRear(int value) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear++;
        }

        deque[rear] = value;
        System.out.println(value + " inserted at rear");
    }

    // Delete from front
    void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println(deque[front] + " deleted from front");

        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
    }

    // Delete from rear
    void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println(deque[rear] + " deleted from rear");

        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }
    }

    // Display the deque
    void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.print("Deque elements: ");
        int i = front;
        while (true) {
            System.out.print(deque[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    // Peek front
    void getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
        } else {
            System.out.println("Front element: " + deque[front]);
        }
    }

    // Peek rear
    void getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
        } else {
            System.out.println("Rear element: " + deque[rear]);
        }
    }

    // Main method with menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of deque: ");
        int n = sc.nextInt();
        CircularDeque dq = new CircularDeque(n);

        while (true) {
            System.out.println("\n--- Deque Menu ---");
            System.out.println("1. Insert Front\n2. Insert Rear\n3. Delete Front\n4. Delete Rear");
            System.out.println("5. Display\n6. Get Front\n7. Get Rear\n8. Exit");
            System.out.print("Choose an option: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value to insert at front: ");
                    dq.insertFront(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value to insert at rear: ");
                    dq.insertRear(sc.nextInt());
                    break;
                case 3:
                    dq.deleteFront();
                    break;
                case 4:
                    dq.deleteRear();
                    break;
                case 5:
                    dq.display();
                    break;
                case 6:
                    dq.getFront();
                    break;
                case 7:
                    dq.getRear();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

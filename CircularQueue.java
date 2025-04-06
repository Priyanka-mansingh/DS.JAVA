import java.util.Scanner;

public class CircularQueue {
    int[] queue;
    int front, rear, size;

    // Constructor
    CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue operation
    void enqueue(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Overflow (Full)");
            return;
        }

        if (front == -1) { // First element
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        queue[rear] = value;
        System.out.println(value + " enqueued.");
    }

    // Dequeue operation
    void dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow (Empty)");
            return;
        }

        System.out.println(queue[front] + " dequeued.");

        if (front == rear) { // Only one element
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    // Display the queue
    void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    // Peek at front
    void peek() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    // Main method (with menu)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the circular queue: ");
        int n = sc.nextInt();
        CircularQueue cq = new CircularQueue(n);

        while (true) {
            System.out.println("\n--- Circular Queue Menu ---");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Display\n4. Peek\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    cq.enqueue(val);
                    break;
                case 2:
                    cq.dequeue();
                    break;
                case 3:
                    cq.display();
                    break;
                case 4:
                    cq.peek();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

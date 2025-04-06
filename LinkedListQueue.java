import java.util.Scanner;

public class LinkedListQueue {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    // Queue front and rear
    Node front = null, rear = null;

    // Enqueue operation
    void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(value + " enqueued.");
    }

    // Dequeue operation
    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(front.data + " dequeued.");
            front = front.next;
            if (front == null) rear = null;
        }
    }

    // Peek operation
    void peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    // Display operation
    void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements:");
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Main method with menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListQueue q = new LinkedListQueue();

        while (true) {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Peek\n4. Display\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

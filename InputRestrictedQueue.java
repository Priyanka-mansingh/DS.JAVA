class InputRestrictedQueue {
    int size;
    int[] deque;
    int front, rear;

    // Constructor
    public InputRestrictedQueue(int size) {
        this.size = size;
        deque = new int[size];
        front = -1;
        rear = -1;
    }

    // Insert at rear only
    public void insertRear(int value) {
        if ((front == 0 && rear == size - 1) || (rear + 1 == front)) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear++;
        }

        deque[rear] = value;
        System.out.println(value + " inserted at rear.");
    }

    // Delete from front
    public void deleteFront() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(deque[front] + " deleted from front.");

        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
    }

    // Delete from rear
    public void deleteRear() {
        if (rear == -1) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(deque[rear] + " deleted from rear.");

        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }
    }

    // Display the queue
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(deque[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

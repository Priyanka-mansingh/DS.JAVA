import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Creating a priority queue (min-heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        pq.add(40);

        System.out.println("Priority Queue elements (natural order): " + pq);

        // Peeking the highest priority (smallest element)
        System.out.println("Head of queue (peek): " + pq.peek());

        // Removing elements in priority order
        System.out.println("\nRemoving elements in order of priority:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

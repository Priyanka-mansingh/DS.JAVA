import java.util.PriorityQueue;

public class PriorityQueueRemoveDemo {
    public static void main(String[] args) {
        // Creating a PriorityQueue (min-heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(40);
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(50);

        System.out.println("Initial PriorityQueue: " + pq);

        // Remove the head of the queue (smallest element)
        int removedHead = pq.poll();  // or pq.remove()
        System.out.println("Removed head (poll): " + removedHead);
        System.out.println("PriorityQueue after removing head: " + pq);

        // Remove a specific element (e.g., 30)
        boolean removedSpecific = pq.remove(30);
        if (removedSpecific) {
            System.out.println("Element 30 removed.");
        } else {
            System.out.println("Element 30 not found.");
        }

        System.out.println("Final PriorityQueue: " + pq);
    }
}

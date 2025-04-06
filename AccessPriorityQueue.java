import java.util.PriorityQueue;
import java.util.Iterator;

public class AccessPriorityQueue {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers (min-heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(50);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(40);

        // Accessing the head element
        System.out.println("Head element (peek): " + pq.peek());

        // Accessing all elements using iterator (not sorted)
        System.out.println("\nAll elements using iterator:");
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // Accessing all elements in sorted order using poll
        System.out.println("\n\nAccessing elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}

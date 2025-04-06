
import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueIteration {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        pq.add(40);

        // Iterating using for-each loop
        System.out.println("Iterating using for-each loop:");
        for (int num : pq) {
            System.out.print(num + " ");
        }

        // Iterating using iterator
        System.out.println("\n\nIterating using Iterator:");
        Iterator<Integer> iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // Iterating in priority order (smallest to largest)
        System.out.println("\n\nIterating in priority order (using poll):");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}

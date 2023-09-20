import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class QueueExmpl {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("1");
        queue.add("2");
        queue.add("three");
        queue.add("4");

        System.out.println("Queue: " + queue);

        // Dequeue elements from the queue
        String element1 = queue.poll();
        String element2 = queue.poll();

     
        System.out.println("Dequeued Elements:");
        System.out.println(element1);
        System.out.println(element2);

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Front 1");
        deque.addLast("Rear 1");
        deque.addFirst("Front 2");
        deque.addLast("Rear 2");

      
        System.out.println("Deque: " + deque);

        // Remove elements from both ends of the Deque
        String frontElement = deque.pollFirst();
        String rearElement = deque.pollLast();

        // Display the removed elements
        System.out.println("Removed Front Element: " + frontElement);
        System.out.println("Removed Rear Element: " + rearElement);

        // Display the updated Deque
        System.out.println("Updated Deque: " + deque);

    }
}

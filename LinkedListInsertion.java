import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListInsertion {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Using forEach to insert at the first and last positions
        System.out.println("Using forEach to insert at first and last positions:");
        linkedList.forEach(element -> {
            if (linkedList.indexOf(element) == 0) {
                linkedList.addFirst("Apple");
            }
            if (linkedList.indexOf(element) == linkedList.size() - 1) {
                linkedList.addLast("Date");
            }
        });

        // Print the updated LinkedList
        System.out.println("LinkedList after inserting elements:");
        linkedList.forEach(System.out::println);

        // Clear the LinkedList for the next example
        linkedList.clear();

        // Add elements to the LinkedList
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Using ListIterator to insert at the first and last positions
        System.out.println("\nUsing ListIterator to insert at first and last positions:");
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
        //    String element = iterator.next();
            if (!iterator.hasNext()) {
                iterator.add("Date");
            }
            if (iterator.previousIndex() == 0) {
                iterator.add("Apple");
            }
        }

        // Print the updated LinkedList
        System.out.println("LinkedList after inserting elements:");
        linkedList.forEach(System.out::println);
    }
}

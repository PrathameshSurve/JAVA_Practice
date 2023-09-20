import java.util.LinkedList;

public class LinkedListIteration {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("Birth");
        linkedList.add("Choice");
        linkedList.add("Death");

        for (int i = 0; i < linkedList.size(); i++) {
            String element = linkedList.get(i);
            System.out.println("Element at index " + i + ": " + element);
        }
    }
}

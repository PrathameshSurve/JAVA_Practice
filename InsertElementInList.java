
import java.util.LinkedList;

public class InsertElementInList {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");

        System.out.println("Original Linked List: " + linkedList);

        String elementToInsert = "newElement added";

        int positionToInsert = 2;

        linkedList.add(positionToInsert, elementToInsert);

        System.out.println("Linked List after Insertion: " + linkedList);
    }
}

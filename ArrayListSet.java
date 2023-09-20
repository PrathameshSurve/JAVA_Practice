import java.util.ArrayList;
import java.util.*;

public class ArrayListSet {
    public static void main(String[] args) {
        ArrayList<Integer> element = new ArrayList<>();

        element.add(1);
        element.add(2);
        element.add(3);
        element.add(4);
        element.add(5);

        System.out.println("Your arraylist is: " + element);
        System.out.println("Arraylist is empty: " + element.isEmpty());

        Collections.shuffle(element);
        System.out.println("After shuffling elements arraylist is: " + element);

        element.removeAll(element);
        System.out.println("After removing elements arraylist is empty: " + element.isEmpty());

    }
}
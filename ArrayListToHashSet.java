import java.util.*;

public class ArrayListToHashSet {
    public static void main(String[] Args) {
        ArrayList<Integer> set1 = new ArrayList<>();
        
 
        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(5);
        set1.add(0);
        set1.add(null);
        
        System.out.println("This is arraylist: " + set1);
        Set<Integer> set2 = new HashSet<>();
        for (Integer  elemnts : set1){
            set2.add(elemnts);
        }
        System.out.println("This is the hashset: "+ set2);
    }
}
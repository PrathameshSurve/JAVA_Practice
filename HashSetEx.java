import java.util.*;

public class HashSetEx {
    public static void main(String[] Args) {
        Set<Integer> set1 = new HashSet<>();// hashset give ouput in unsorted format.
        //TreeSet is also there, but it not tak null values and also gives ouput in sorted format 

        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(5);
        set1.add(0);
        set1.add(null);

        System.out.println(set1);

        for (Integer  elemnt : set1){
            System.out.println(elemnt);
        }


    }
}
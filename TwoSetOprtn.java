import java.util.HashSet;
import java.util.Set;

public class TwoSetOprtn{
    public static void main(String[] args){
       Set<Integer> set1 = new HashSet<>();
       Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(5);
        set1.add(0);
        set1.add(null);

       set2.add(56);
       set2.add(9);
       set2.add(2);
       set2.add(3);
       set2.add(43);
       set2.add(0);

        System.out.println("This is the set1: " + set1);
        System.out.println("This is the set2: "+ set2);

        // Set<Integer> union = new HashSet<>();
        // union.addAll(set1);
        // union.addAll(set2);
        // System.out.println("This is the Union: "+ union);

        // Set<Integer> intrsect = new HashSet<>();
        // for(Integer elmnt: set1){
        //     for (Integer el : set2)
        //    if(set1.contains(el)){
        //     intrsect.add(el);
        //    }
        // }
        // System.out.println("This is the Intersect: "+ intrsect);

        // Set<Integer> differ = new HashSet<>();
        // for(Integer elmnt: set1){
        //     for (Integer el : set2)
        //    if(!(set1.contains(el))){
        //     differ.add(el);
        //    }
        // }
        // System.out.println("This is the Difference: "+ differ);



        Set<Integer> union2 = new HashSet<>(set1);
        union2.addAll(set2);

        
        Set<Integer> intersection2 = new HashSet<>(set1);
        intersection2.retainAll(set2);

     
        Set<Integer> differ2 = new HashSet<>(union2);
        differ2.removeAll(set2);
        set2.removeAll(set1);
        differ2.addAll(set2);
        

        System.out.println("This is the correct Union: "+ union2);
        System.out.println("This is the correct Intersection: "+ intersection2);
        System.out.println("This is the correct Difference: "+ differ2);
       
    }
}
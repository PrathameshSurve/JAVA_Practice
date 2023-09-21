import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class HashMapEx{
    public static void main(String[] args){
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Hello");
        map1.put(2, "World");
        map1.put(3, "!");
        map1.put(3, "Hash");
        map1.put(4, "Hash");

        System.out.println("This is map1: " + map1);
        for(Map.Entry<Integer, String> a:map1.entrySet()){
            System.out.println(a.getKey()+ " "+a.getValue());
        }   
        

        ArrayList<String> combinedList = new ArrayList<>();
        combinedList.add("India");
        combinedList.add("Japan");
        combinedList.add("China");
        combinedList.add("Japan");
        combinedList.add("green");
        combinedList.add("blue");
        combinedList.add("white");
        combinedList.add("black");
        combinedList.add("apples");
        combinedList.add("bananas");
        combinedList.add("oranges");
        combinedList.add("grapes");

        Map<String, ArrayList<String>> map = new HashMap<>();
        
        // Create sections in the map
        map.put("Countries", new ArrayList<>(combinedList.subList(0, 4)));
        map.put("Colors", new ArrayList<>(combinedList.subList(4, 8)));
        map.put("Fruits", new ArrayList<>(combinedList.subList(8, 12)));

        System.out.println("This is map2: ");
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }            
}                     
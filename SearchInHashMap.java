import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchInHashMap {
    public static void main(String[] maps){

         Map<String, String> map = new HashMap<>();
         map.put("India", "New Delhi");
         map.put("Japan", "Tokyo");
         map.put("China", "Beijing");
         map.put("USA", "Washington, D.C.");
         map.put("green", "color");
         map.put("Sandal", "Object");

         
 
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Enter the search value: ");
         String searchValue = scanner.nextLine();
 
         // Check if the search value is a key in the map
         if (map.containsKey(searchValue)) {
             System.out.println(searchValue + " Found. It's a key.");
         } 
         // Check if the search value is a value in the map
         else if (map.containsValue(searchValue)) {
             System.out.println(searchValue + " Found. It's a value.");
         } 
         // If not found, display "Value Not Found"
         else {
             System.out.println("Value Not Found.");
         }
 
        
         scanner.close();

    }
}
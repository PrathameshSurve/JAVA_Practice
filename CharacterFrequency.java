import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        System.out.println("Enter String/s: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        Map<Character, Integer> charFrequencyMap = new HashMap<>();
         
        for (char c : str.toCharArray()) {
            char upperCaseChar = Character.toUpperCase(c);

            charFrequencyMap.put(upperCaseChar, charFrequencyMap.getOrDefault(upperCaseChar, 0) + 1);
        }

        char mostFrequentChar = '\0';
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        for (Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("High Frequency - " + mostFrequentChar + " Occured "+maxFrequency+ " Times.");
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class CombineNamesArraylist {
    public static void main(String[] args) {
        ArrayList<String> surnames = new ArrayList<>();
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> combinedNames = new ArrayList<>();

        surnames.add("Gole");
        surnames.add("Surve");
        surnames.add("Patil");
        surnames.add("Ghatge");
        surnames.add("Yadav");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 first names:");

        for (int i = 0; i < 5; i++) {
            String firstName = scanner.nextLine();
            firstNames.add(firstName);
        }

        for (int i = 0; i < 5; i++) {
            String fullName = firstNames.get(i) + " " + surnames.get(i);
            combinedNames.add(fullName);
        }

        scanner.close();

        System.out.println("Combined Names:");
        for (String name : combinedNames) {
            System.out.println(name);
        }
    }
}

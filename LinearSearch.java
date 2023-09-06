import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to search for: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < length; i++) {
            if (arr[i] == target) {
                found = true;
                System.out.println("Value " + target + " found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Value " + target + " not found in the array.");
        }

        scanner.close();
    }
}

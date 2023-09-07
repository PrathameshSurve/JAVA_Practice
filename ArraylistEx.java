import java.util.ArrayList;
import java.util.*;

public class ArraylistEx {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ther size of arraylist: ");
        int size = scan.nextInt();
        arr = new ArrayList<Integer>(size);
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            int item = scan.nextInt();
            arr.add(item);
        }
        System.out.println("Your initial arraylist is : " + arr);
        // Collections.reverse(arr); //We can also use this inbuild function for reverse
        int left = 0;
        int right = arr.size() - 1;
        while (left < right) {
            int temp = arr.get(left); 
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left++; 
            right--;
        }
        System.out.println("Reverese of your arraylist is : " + arr);
        scan.close();
    }

}

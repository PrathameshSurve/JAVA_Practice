import java.util.Scanner;

public class Stack_Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stck stack = new Stck();

        while (true) {
            System.out.println(
                    "Choose one option from below to perform an operation on stack.\n1. Pop\n2. Push\n3. Peek\n4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    stack.pop();
                    break;
                case 2:
                    System.out.print("Enter an integer to push onto the stack: ");
                    int itemToPush = scanner.nextInt();
                    stack.push(itemToPush);
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    System.out.println("Operation exited.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("You have chosen the wrong choice.\nPlease try again.");
            }
        }
    }
}

class Stck {
    private static final int MAX_SIZE = 5;
    private int[] stackArray;
    private int top;

    public Stck() {
        stackArray = new int[MAX_SIZE];
        top = -1; // Initialize the top of the stack
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            int poppedItem = stackArray[top--];
            System.out.println("Popped " + poppedItem + " from the stack.");
        }
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
        } else {
            stackArray[++top] = item;
            System.out.println("Pushed " + item + " onto the stack.");
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a sentinel value indicating an empty stack
        } else {
            int topItem = stackArray[top];
            System.out.println("Top item on the stack: " + topItem);
            return topItem;
        }
    }
}

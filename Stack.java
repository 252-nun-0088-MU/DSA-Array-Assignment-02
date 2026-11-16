
import java.util.Scanner;

public class Main {

    int stack[];
    int top;
    int size;

    // Creating the stack
    Main(int n) {
        size = n;
        stack = new int[size];
        top = -1;
    }

    // Insert an element into the stack
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is full! Cannot insert.");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " inserted successfully.");
        }
    }

    // Remove the top element
    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty! Nothing to remove.");
        } else {
            System.out.println("Removed element: " + stack[top]);
            top--;
        }
    }

    // Show the top element
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    // Show all stack elements
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Elements in the stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of stack: ");
        int n = input.nextInt();

        Main s = new Main(n);

        int choice;

        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number to insert: ");
                    int value = input.nextInt();
                    s.push(value);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Wrong choice! Try again.");
            }

        } while (choice != 5);

        input.close();
    }
}

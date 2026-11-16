
import java.util.Scanner;

public class Main {

    int queue[];
    int front, rear, size;

    // Constructor to create a queue
    Main(int n) {
        size = n;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Add an element to the queue
    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is full. Cannot add more elements.");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = value;
            System.out.println(value + " added to the queue.");
        }
    }

    // Remove an element from the queue
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty. Nothing to remove.");
        } else {
            System.out.println("Removed element: " + queue[front]);
            front++;

            if (front > rear) {
                front = -1;
                rear = -1;
            }
        }
    }

    // Show the first element
    void showFront() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("First element is: " + queue[front]);
        }
    }

    // Display all elements
    void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements are:");
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of queue: ");
        int n = sc.nextInt();

        Main q = new Main(n);

        int choice;

        do {
            System.out.println("\n--- Queue Operations ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Front");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = sc.nextInt();
                    q.enqueue(value);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.showFront();
                    break;

                case 4:
                    q.display();
                    break;

                case 5:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}

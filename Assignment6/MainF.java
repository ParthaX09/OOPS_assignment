import java.util.Scanner;
class MainF
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the queue size:");
        int maxSize = sc.nextInt(); 
        int[] queue = new int[maxSize];
        int front = -1;
        int rear = -1;

        while (true) 
        {
            System.out.println("-----Linear Queue Operations Menu:-----");
            System.out.println("1. Enqueue ");
            System.out.println("2. Dequeue ");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();

            switch (ch) 
            {
                case 1:
                    if (rear == maxSize - 1) {
                        System.out.println("Queue is full. Cannot enqueue.");
                    } else {
                        System.out.print("Enter element to enqueue: ");
                        int element = sc.nextInt();
                        if (front == -1) {
                            front = 0;
                        }
                        queue[++rear] = element;
                        System.out.println("Enqueued " + element + " into the queue.");
                    }
                break;
                case 2:
                    if (front == -1) {
                        System.out.println("Queue is empty. Cannot dequeue.");
                    } else {
                        int dequeuedElement = queue[front++];
                        System.out.println("Dequeued " + dequeuedElement + " from the queue.");
                        if (front > rear) {
                            front = rear = -1; 
                        }
                    }
                break;
                case 3:
                    if (front == -1) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue elements:");
                        for (int i = front; i <= rear; i++) {
                            System.out.print(queue[i] + " ");
                        }
                        System.out.println();
                    }
                break;
                case 4:
                    System.out.println("-----Exiting the program.-----");
                    sc.close();
                    System.exit(0);
                break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

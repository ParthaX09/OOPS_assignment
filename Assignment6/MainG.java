import java.util.Scanner;
class MainG
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the queue size:");
        int maxSize = sc.nextInt(); 
        int[] queue = new int[maxSize];
        int front = -1;
        int rear = -1;

        while (true) 
        {
            System.out.println("-----Circular Queue Operations Menu:-----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();

            switch (ch) 
            {
                case 1:
                        if ((rear + 1) % maxSize == front) 
                            System.out.println("Queue is full. Cannot enqueue.");
                        else 
                        {
                            System.out.print("Enter element to enqueue: ");
                            int element = sc.nextInt();
                            if (front == -1) 
                                front = 0;
                            rear = (rear + 1) % maxSize;
                            queue[rear] = element;
                            System.out.println("Enqueued " + element + " into the queue.");
                        }
                break;
                case 2:
                        if (front == -1)
                            System.out.println("Queue is empty. Cannot dequeue.");
                        else 
                        {
                            int dequeuedElement = queue[front];
                            if (front == rear)
                                front = rear = -1; 
                            else 
                                front = (front + 1) % maxSize;
                            System.out.println("Dequeued " + dequeuedElement + " from the queue.");
                        }
                break;
                case 3:
                        if (front == -1) 
                            System.out.println("Queue is empty.");
                        else 
                        {
                            System.out.println("Queue elements:");
                            int i = front;
                            while (true) 
                            {
                                System.out.print(queue[i] + " ");
                                if (i == rear)
                                    break;
                                i = (i + 1) % maxSize;
                            }
                            System.out.println();
                        }
                break;
                case 4: System.out.println("Exiting the program.");
                        sc.close();
                        System.exit(0);
                break;
                default:System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

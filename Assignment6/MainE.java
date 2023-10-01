import java.util.Scanner;
class MainE
{
        public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int stck[];
        System.out.print("Enter the stack size:");
        int max = sc.nextInt();
        stck = new int[max];
        int top = -1;
        while(true)
        {
            System.out.println("\n\n----STACK OPERATIONS----");
            System.out.println("1.Push \n2.Pop \n3.Display \n4.Exit \nEnter your choice:");
            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:if (top == max - 1) 
                        System.out.println("Stack is full. Cannot push.");
                    else 
                    {
                        System.out.print("Enter element to push: ");
                        int element = sc.nextInt();
                        stck[++top] = element;
                    }
                break;
                case 2:if (top == -1) 
                            System.out.println("Stack is empty. Cannot pop.");
                        else 
                        {
                            int poppedElement = stck[top--];
                            System.out.println("Popped " + poppedElement + " from the stack.");
                        } 
                break;
                case 3:if (top == -1) 
                            System.out.println("Stack is empty.");
                        else 
                        {
                            System.out.println("Stack elements:");
                            for (int i = 0; i <= top; i++) {
                                System.out.print(stck[i] + " ");
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

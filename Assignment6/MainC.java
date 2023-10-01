import java.util.Scanner;
class MainC
{
        public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[];
        while(true)
        {
            System.out.println("\n\n----SORTING----");
            System.out.println("1.Bubble Sort \n2.Selection Sort \n3.Insertion Sort \nEnter your choice:");
            int ch = sc.nextInt();
            
            System.out.println("Enter the 1-D array size:");
            int n = sc.nextInt();
            arr = new int[n];
            
            System.out.println("Enter the array elements:");
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();

            switch(ch)
            {
                case 1:for (int i = 0; i < n - 1; i++) 
                       {
                            for (int j = 0; j < n - i - 1; j++) 
                            {
                                if (arr[j] > arr[j + 1]) 
                                {
                                    int temp = arr[j];
                                    arr[j] = arr[j + 1];
                                    arr[j + 1] = temp; 
                                }
                            }
                        }
                break;
                case 2: for (int i = 0; i < n - 1; i++) 
                        {
                            int min = i;
                            for (int j = i + 1; j < n; j++) 
                            {
                                if (arr[j] < arr[min]) 
                                    min = j;
                            }
                            int temp = arr[min];
                            arr[min] = arr[i];
                            arr[i] = temp;
                        }
                break;
                case 3:for (int i = 1; i < n; i++) 
                        {
                            int key = arr[i];
                            int j = i - 1;
                            while (j >= 0 && arr[j] > key) 
                            {
                                arr[j + 1] = arr[j];
                                j = j - 1;
                            }
                            arr[j + 1] = key;
                        }
                break;
                default: System.exit(0);
            }

            System.out.print("Sorted array:");
            for(int x: arr)
                System.out.print(x+"\t");   
        }   
    }
}

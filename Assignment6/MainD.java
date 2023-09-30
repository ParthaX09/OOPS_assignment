import java.util.Scanner;
class MainD
{
        public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[];
        while(true)
        {
            System.out.println("\n\n----SORTING----");
            System.out.println("1.Linear Search \n2.Binary Search \nEnter your choice:");
            int ch = sc.nextInt();
            
            System.out.println("Enter the 1-D array size:");
            int n = sc.nextInt();
            arr = new int[n];
            
            System.out.println("Enter the array elements:");
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            
            System.out.print("Enter the key element:");
            int key = sc.nextInt();

            switch(ch)
            {
                case 1:int i;
                        for (i = 0; i < n - 1; i++) 
                       {
                            if (arr[i] == key) 
                            {
                                System.out.println("Key element found at position "+ (i+1));
                                break;
                            }
                        }
                        if(i== n)
                            System.out.println("Key element not found");
                break;
                case 2: int lb = 0;
                        int ub = n;
                        int mid=0;
                        while (lb <= ub) 
                        {
                            mid = (lb+ub) / 2;
                            if (arr[mid] == key) 
                                break; 
                            else if (arr[mid] < key) 
                                lb = mid + 1; 
                            else 
                                ub = mid - 1; 
                        }
                        if(arr[mid]==key)
                            System.out.println("Key element found at position "+(mid+1));
                        else
                            System.out.println("Key element not found");
                break;
                default: System.exit(0);
            }      
        }        
    }
}

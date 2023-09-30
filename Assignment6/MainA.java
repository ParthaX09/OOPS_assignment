import java.util.Scanner;
class MainA
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int ar[], arr[][];

        System.out.println("Enter the 1-D array size:");
        int n = sc.nextInt();
        ar = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
            ar[i] = sc.nextInt();
        int min=ar[0],max=ar[0];
        for(int i=0;i<n;i++)
        {
            if(ar[i] > max)
                max = ar[i];
            if(ar[i] < min)
                min = ar[i];
        }
        System.out.println("Max="+max+"\nMin="+min);
        
        
        System.out.println("\n\n\nEnter the 2-D array size:");
        int m = sc.nextInt();
        n = sc.nextInt();
        arr = new int[m][n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                arr[i][j] = sc.nextInt();
        max=arr[0][0];
        min=arr[0][0];  
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j] > max)
                    max = arr[i][j];
                if(arr[i][j] < min)
                    min = arr[i][j];
            }
        }
        System.out.println("Max="+max+"\nMin="+min);


        sc.close();
    }
}

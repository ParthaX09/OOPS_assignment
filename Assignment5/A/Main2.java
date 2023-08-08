import java.util.Scanner;
public class Main2
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows:");
        int n=sc.nextInt();
        int x=65;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            
            for(int j=1;j<=i;j++)
                System.out.print((char)x+++" ");
            System.out.println();
        }
    }
}

import java.util.Scanner;
public class MainB
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of terms for fibonacci series:");
        int n=sc.nextInt();
        int a=0,b=1,c;
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            System.out.print(a+" ");
            a=b;
            b=c;
        }
    }
}

import java.util.Scanner;
public class MainA
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("For y=x^n enter the value for x and n:");
        int x=sc.nextInt();
        int n=sc.nextInt();
        int p=1;
        while(n>0)
        {
            p*=x;
            n--;
        }
        System.out.println("y="+p);
    }
}

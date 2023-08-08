import java.util.Scanner;
public class MainA
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int a1=a,b1=b;
        System.out.println("a="+a+" b="+b);
        System.out.println("Swapping using 3rd variable");
        int c=a1;
        a1=b1;
        b1=c;
        System.out.println("a="+a1+" b="+b1);
        
        System.out.println("Swapping without 3rd variable");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" b="+b);
    }
}

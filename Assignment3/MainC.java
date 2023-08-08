import java.util.Scanner;
public class MainC
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year:");
        int y=sc.nextInt();
        if(y%400==0 ||(y%4==0 && y%100!=0))
            System.out.println(y+" is Leap year");
        else 
            System.out.println(y+" is not leap year");
    }
}

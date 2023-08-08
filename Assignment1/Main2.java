import java.util.Scanner;
public class Main2
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        int rad=sc.nextInt();
        double p=2*3.142*rad;
        double a=3.142*rad*rad;
        System.out.println("Perimeter:"+p );
        System.out.println("Area:"+a);
    }
}

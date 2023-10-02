import java.util.Scanner;
public class MainA
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three nos:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=(a>b && a>c)?a:(b>c)?b:c;
        System.out.println("Largest number: "+max);

        sc.close();
     }
}

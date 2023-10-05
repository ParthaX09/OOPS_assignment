import java.util.Scanner;

class TowerOfHanoiSolver 
{
    public void TOH(int n, char source, char auxiliary, char destination) 
    {
        if (n == 1) 
        {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        
        TOH(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        TOH(n - 1, auxiliary, source, destination);
    }
}

public class TowerOfHanoi
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();
        sc.close();

        TowerOfHanoiSolver tohSolver = new TowerOfHanoiSolver();
        tohSolver.TOH(n, 'A', 'B', 'C');
    }
}

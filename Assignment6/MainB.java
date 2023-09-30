import java.util.Scanner;
class MainB
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int P[], Q[], R[];

        System.out.println("Enter the 1-D array size of P[] and Q[]:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        P = new int[m];
        Q = new int[n];
        R = new int[m+n];

        System.out.println("Enter the array elements for P[]:");
        for(int i=0;i<m;i++)
            P[i] = sc.nextInt();
        
        System.out.println("Enter the array elements for Q[]:");
        for(int i=0;i<n;i++)
            Q[i] = sc.nextInt();

        int i=0,j=0,k=0;
        while (i < m && j < n) 
        {
            if (P[i] < Q[j]) 
                R[k++] = P[i++];
            else 
                R[k++] = Q[j++];
            
        }
        while (i < m) {
            R[k++] = P[i++];
        }
        while (j < n) {
            R[k++] = Q[j++];
        }
        
        System.out.print("The sorted array is:");
        for(i=0;i<m+n;i++)
            System.out.println(R[i]+"\t");
        
       
        sc.close();
    }
}

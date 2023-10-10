public class shape
{
    public static void rect(int n, char ch) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    
    public static void rect(int l, int b, char ch) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        
        rect(5, '*');          
        System.out.println();
        rect(4, 7, '#');       
    }
}

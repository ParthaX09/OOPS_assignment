public class MainB {
    public static void main(String[] args) {
        int[] ar = new int[10];

        try {
           
            ar[15] = 42;
            
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());

            try {
                
                throw e;
            } catch (ArrayIndexOutOfBoundsException ae) {
                
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + ae.getMessage());
            }
        }
    }
}

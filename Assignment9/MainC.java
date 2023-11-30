public class MainC {
    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length();
        } 
        catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } 
        finally {
            System.out.println("This block is always executed, regardless of exceptions.");
            
        }
    }
}

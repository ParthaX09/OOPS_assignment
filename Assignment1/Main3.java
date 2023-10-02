
public class Main3
{
    public static void main (String[] args) 
    {
        if(args.length>0)
            for(String s: args)
                System.out.print(s+" ");
        else
            System.out.println("No input in command line");
    }
}

import java.util.Scanner;

class Room
{
    double width,  height,  bredth;
    Room(double width, double height, double bredth)
    {
        this.width = width;
        this.height = height;
        this.bredth = bredth;
    }
    public double volume()
    {
        return width * height * bredth;        
    }
}


class RoomDemo extends Room 
{
    RoomDemo(double width, double height, double breadth) 
    {
        super(width, height, breadth);
    }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width height and bredth:");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double bredth = sc.nextDouble();
        RoomDemo room1 = new RoomDemo(width, height, bredth);
        System.out.println("Volume of the room: "+room1.volume()+" cubic units");

        sc.close();        
    }
}

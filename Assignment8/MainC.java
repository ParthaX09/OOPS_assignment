abstract class TwoDFigure 
{
    public abstract double calculateArea(double d1, double d2);
}

class Rectangle extends TwoDFigure {
    @Override
    public double calculateArea(double d1, double d2) {
        return d1 * d2;
    }
}

class Triangle extends TwoDFigure {
    @Override
    public double calculateArea(double d1, double d2) {
        return 0.5 * d1 * d2;
    }
}

public class MainC {
    public static void main(String[] args) {
        TwoDFigure rec = new Rectangle();
        TwoDFigure tr = new Triangle();

        System.out.println("Area of Rectangle: " + rec.calculateArea(5,4));
        System.out.println("Area of Triangle: " + tr.calculateArea(6,8));
    }
}

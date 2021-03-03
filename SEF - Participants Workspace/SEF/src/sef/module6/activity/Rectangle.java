package activity;

public abstract class Rectangle extends Shape{

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double area() {
        // A = b * l
        return breadth * length;
    }
    @Override
    public double perimeter() {
        // P = 2(b + l)
        return 2 * (breadth + length);
    }

}
package chapter11_Adstraction;

public class Rectangle extends Shape {


    private double length;
    private double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);

    }
    @Override
    double calculateArea() {
        return length * width;
    }
}

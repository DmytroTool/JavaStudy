package homeJob_12;

abstract class Shape {
    protected double square;
    protected double perimeter;

    public double getSquare() {
        return square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public abstract void calculateSquare();

    public abstract void calculatePerimeter();
}

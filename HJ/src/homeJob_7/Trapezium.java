package homeJob_7;

class Trapezium extends Shape {
    private double a;
    private double b;
    private double c;
    private double d;
    private double height;

    public Trapezium(double a, double b, double c, double d, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.height = height;
    }

    @Override
    public void calculateSquare() {
        square = (a + b) * height / 2;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = a + b + c + d;
    }
}


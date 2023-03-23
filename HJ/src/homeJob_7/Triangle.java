package homeJob_7;

class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void calculateSquare() {
        double p = (a + b + c) / 2;
        square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void calculatePerimeter() {
        perimeter = a + b + c;
    }
}



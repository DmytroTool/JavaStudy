package homeJob_7;

class Parallelogram extends Shape {
    private double base;
    private double height;
    private double side;

    public Parallelogram(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    @Override
    public void calculateSquare() {
        square = base * height;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (base + side);
    }
}



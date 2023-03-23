package homeJob_12;

class Quadratic extends Shape {
    private double length;

    public Quadratic(double length) {
        this.length = length;
    }

    @Override
    public void calculateSquare() {
        square = length * length;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 4 * length;
    }
}


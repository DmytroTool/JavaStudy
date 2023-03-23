package homeJob_12;

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void calculateSquare() {
        square = Math.PI * r * r;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * r;
    }
}

class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double side) {
        super(side, side, 2 * side);
    }
}


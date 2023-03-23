package homeJob_7;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateSquare() {
        square = Math.PI * radius * radius;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }
}


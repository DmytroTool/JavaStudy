package homeJob_7;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateSquare() {
        square = width * height;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (width + height);
    }
}





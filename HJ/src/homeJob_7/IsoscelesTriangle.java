package homeJob_7;

class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double base, double height) {
        super(base, height, Math.sqrt(base * base + height * height));
    }
}


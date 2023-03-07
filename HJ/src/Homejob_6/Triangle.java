package Homejob_6;

public class Triangle {
    double sideA;
    double sideB;
    double sideC;
        public Triangle(double sideA,double sideB, double sideC) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
            this.sideA = sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double calcPerimeter(double sideA, double sideB, double sideC) {
            double perimeter = sideA+sideB+sideC;

        return perimeter;
    }


    public double calcArea(double sideA, double sideB, double sideC) {
        double area = sideA*sideB*sideC;

        return area;
    }



}

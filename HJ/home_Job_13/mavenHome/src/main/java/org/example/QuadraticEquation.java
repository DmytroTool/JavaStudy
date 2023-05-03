package org.example;

public class QuadraticEquation {
    private double coefficientA;
    private double coefficientB;

    private double coefficientC;
    public  QuadraticEquation(double a, double b, double c) {
        coefficientA = a;
        coefficientB = b;
        coefficientC = c;
    }

    public double[] getRoot() {
        double discriminant = coefficientB * coefficientB - 4 * coefficientA * coefficientC;

        if (discriminant > 0) {
            double x1 = (-coefficientB + Math.sqrt(discriminant)) / (2 * coefficientA);
            double x2 = (-coefficientB - Math.sqrt(discriminant)) / (2 * coefficientA);

            return new double[]{x1, x2};

        } else if (discriminant == 0) {
            double x = -coefficientB / (2 * coefficientA);
            return new double[]{x};

        } else {
            return new double[]{};
        }
    }

}

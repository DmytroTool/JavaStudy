package org.example;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

    QuadraticEquation qe = new QuadraticEquation(a,b,c);
    double[] roots = qe.getRoot();
    if (roots.length == 2) {
        System.out.println("The equation " + a + "x^2 + " + b + "x + " + c + " = 0 has roots:");
            System.out.println("x1 = " + roots[0]);
            System.out.println("x2 = " + roots[1]);
    } else if (roots.length == 1) {
        System.out.println("The equation " + a + "x^2 + " + b + "x + " + c + " = 0 has roots:");
        System.out.println("x = " + roots[0]);
    } else {
        System.out.println("The equation " + a + "x^2 + " + b + "x + " + c + " = 0 has no real roots.");

    }

    }



}

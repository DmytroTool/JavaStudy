package homeJob_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class shapeSorter {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Which shape do you want to add?");
            System.out.println("1. Triangle");
            System.out.println("2. Circle");
            System.out.println("3. IsoscelesTriangle");
            System.out.println("4. Quadratian");

            int choice = scanner.nextInt();

            Shape shape;

            switch (choice) {
                case 1:
                    System.out.print("Enter the length of the first side: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter the length of the second side: ");
                    double b = scanner.nextDouble();
                    System.out.print("Enter the length of the third side: ");
                    double c = scanner.nextDouble();
                    shape = new Triangle(a, b, c);
                    break;
                case 2:
                    System.out.print("Enter the radius: ");
                    double r = scanner.nextDouble();
                    shape = new Circle(r);
                    break;
                case 3:
                    System.out.print("Enter the length of the equal sides: ");
                    double side = scanner.nextDouble();
                    shape = new IsoscelesTriangle(side);
                    break;
                case 4:
                    System.out.print("Enter the length of the side: ");
                    double length = scanner.nextDouble();
                    shape = new Quadratic(length);
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            shape.calculateSquare();
            shape.calculatePerimeter();
            shapes.add(shape);

            System.out.println("Do you want to add another shape? (y/n)");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("y")) {
                break;
            }
        }

        Collections.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                if (s1.getSquare() == s2.getSquare()) {
                    return Double.compare(s1.getPerimeter(), s2.getPerimeter());
                } else {
                    return Double.compare(s1.getSquare(), s2.getSquare());
                }
            }
        });

        System.out.println("============= Figure list: ===============");
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            if (shape instanceof Triangle) {
                System.out.printf("%d. [Triangle]: Square = %.2f Perimeter = %.2f\n", i + 1, shape.getSquare(), shape.getPerimeter());
            } else if (shape instanceof Circle) {
                System.out.printf("%d. [Circle]: Square = %.2f Perimeter = %.2f\n", i + 1, shape.getSquare(), shape.getPerimeter());
            } else if (shape instanceof IsoscelesTriangle) {
                System.out.printf("%d. [IsoscelesTriangle]: Square = %.2f Perimeter = %.2f\n", i + 1, shape.getSquare(), shape.getPerimeter());
            } else if (shape instanceof Quadratic) {
                System.out.printf("%d. [Quadratian]: Square = %.2f Perimeter = %.2f\n", i + 1, shape.getSquare(), shape.getPerimeter());
            }
        }
    }
}




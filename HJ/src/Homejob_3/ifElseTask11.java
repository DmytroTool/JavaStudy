package Homejob_3;

import java.util.Scanner;

public class ifElseTask11 {
    static boolean checkForPrime(int input) {
        boolean isItPrime = true;
        if (input <= 3) {

            isItPrime = false;

            return isItPrime;

        }

        else{
            for (int i = 2; i <= input / 2; i++) {
                if ((input % i) == 0) {
                    isItPrime = false;

                    break;
                }
            }

            return isItPrime;
        }

    }
    static boolean negativePos(int input) {
        boolean isPos = true;
        if (input < 0) {

             isPos = false;
            return isPos;
        }
        else {
            isPos = false;
            return isPos;

        }

    }

    static boolean evenOdd(int input) {
        boolean isEven = true;
        if (input % 2 == 0) {

            isEven = true;
            return isEven;
        }
        else {
            isEven = false;
            return isEven;
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number :");

        int input = sc.nextInt();
        boolean isItPrime = checkForPrime(input);
        boolean isPos = negativePos(input);
        boolean isEven = evenOdd(input);
        if (isItPrime) {
            System.out.println(input + " is a prime number.");

        } else {
            System.out.println(input + " is  a composite number.");
        }

        if (!isPos) {
            System.out.println(input + " is a negative  number");

        } else {
            System.out.println(input + " is a positive number number.");

        }
        if (isEven) {
            System.out.println(input + " is a even number number.");
        } else {
            System.out.println(input + " is a odd number number.");

        }
    }
}

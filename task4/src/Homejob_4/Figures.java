package Homejob_4;

import java.util.Scanner;

public class Figures

{   static Scanner scan = new Scanner(System.in);
    static String userInput = null;



    public static void main(String args[]) {
        int height1 = Integer.parseInt(args[0]);
        int height2 = Integer.parseInt(args[1]);
        int height3 = Integer.parseInt(args[2]);
        int height4 = Integer.parseInt(args[3]);
        int width5 = Integer.parseInt(args[4]);

        while (true)

        {   askFigure(height1,height2,height3,height4,width5);

            System.out.print("" +
                    "Are You Want to print another figure (Y/N) ?");

            userInput = scan.next();
            if (userInput.equalsIgnoreCase("Y"))
                askFigure(height1,height2,height3,height4,width5);
            else if (userInput.equalsIgnoreCase("N"))
            {
                System.out.print("Thank you !!");
                break;
            }
            else{
                System.out.print("Try Again With (Y/N) only !");
            }

        }



    }

    public static void askFigure(int height2, int height1,int height3,int height4,int width5) {
        System.out.println("Chose the number of figure from 1 to 4 to be printed");
        int num = scan.nextInt();
        if (num == 1)

         {
             drawRectangle(height1,width5);
        }
        else if (num == 2) {
            rightTriangle(height2);

        }
        else if (num == 3) {

            rightTriangleMirrored(height3);

        }
        else if (num == 4) {

            fullTriangle(height4);


        }
        else if (num == 1) {

            drawRectangle(height1,width5);
        }

        else {
            System.out.println("Out of boundary");

        }
    }
    public static void rightTriangleMirrored(int height3) {


        for(int i = 0; i<height3; i++) {
            for( int j = 1; j <height3-i; j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    public static void rightTriangle(int height2)
    {

        for(int i=0; i<height2; i++) {

            for(int j = 0; j<=i; j++) {
                System.out.print("*"); // print star

            }
            System.out.println(); // print star


        }
    }
    public static void fullTriangle(int height4)
    {

        for(int i=1; i<height4; i++) {

            for(int j = 1; j<=height4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i*2-1; k++ ) {
                System.out.print("*");
            }
            System.out.println();



        }
    }
    public static void drawRectangle(int height1, int width5)
{

    for(int i=0; i<height1; i++) {

        for (int j = 0; j < width5; j++) {
            System.out.print("*");
        }

        System.out.println();
    }



    }
}







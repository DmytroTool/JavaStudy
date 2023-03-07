package Homejob_2;

import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input working hours amount");
        double hoursTax = sc.nextDouble();
        System.out.println("Input year salary with taxes");
        double yearTaxes = sc.nextDouble();
        System.out.println("Input taxes percentage amount");
        double taxesAmount = sc.nextDouble();
        double yearFree = (yearTaxes/(100 - taxesAmount))*taxesAmount+(yearTaxes);
        double hourFree = yearFree/4/12/hoursTax;
        System.out.println("With: " + hoursTax + " hours in week and year salary equal: " + yearTaxes + " and Tax equal: " + taxesAmount + " Dollar per hour is: " + hourFree );
        System.out.println(+hourFree);




    }
}
package Homejob_2;

public class Task2 {
    public static void main(String[] args) {

        int weeklyHours = Integer.parseInt(args[0]);
        double salaryHour = Integer.parseInt(args[1]);
        double taxes = Integer.parseInt(args[2]);
        double freeMonthly = (float)(weeklyHours*4*salaryHour);
        double taxesMonthly = (freeMonthly)-((freeMonthly/100)*taxes);
        double yearFree = (freeMonthly*12);
        double yearTaxes = (yearFree)-((yearFree/100)*taxes);

        System.out.println("Your monthly free tax salary is : " + freeMonthly);
        System.out.println("Your monthly salary with tax is : " + taxesMonthly);
        System.out.println("Your annual free tax salary is : " + yearFree);
        System.out.println("Your annual salary with tax is : " + yearTaxes);











    }
}
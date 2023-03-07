package Homejob_3;

public class IfElse3 {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int tax = Integer.parseInt(args[2]);
        int salaryPerHour = Integer.parseInt(args[1]);

        int daysInMonth;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else if (month == 2) {
            daysInMonth = 28;
        } else {
            daysInMonth = 31;
        }
        int workingDays = daysInMonth - 8;
        int monthlySalaryFree = 8 * salaryPerHour * workingDays;
        int monthlySalaryTax = monthlySalaryFree - ((monthlySalaryFree / 100) * tax);



        System.out.println(monthlySalaryFree + " is your Salary free: " + monthlySalaryTax + " Is your Salary taxed");







    }
    }
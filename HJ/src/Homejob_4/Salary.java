package Homejob_4;

import java.time.LocalDate;


import java.time.temporal.TemporalAdjusters;

public class Salary {
    public static void main(String[] args) {
        double salary = 5000.0; // monthly salary before tax
        double taxRate = 0.2; // 20% tax rate
        int workingDays = 22; // number of working days in a month

        LocalDate today = LocalDate.of(2023, 3, 7); // current date
        LocalDate startOfYear = today.with(TemporalAdjusters.firstDayOfYear()); // first day of the year
        LocalDate endOfYear = today.with(TemporalAdjusters.lastDayOfYear()); // last day of the year

        double totalSalary = 0.0; // total salary for the year
        double totalTax = 0.0; // total tax for the year

        for (LocalDate date = startOfYear; date.isBefore(endOfYear.plusDays(1)); date = date.plusMonths(1)) {
            int daysInMonth = date.lengthOfMonth(); // number of days in the month
            int actualWorkingDays = Math.min(workingDays, daysInMonth); // number of actual working days in the month
            double monthlySalary = salary * actualWorkingDays / daysInMonth; // monthly salary before tax
            double monthlyTax = monthlySalary * taxRate; // monthly tax
            double monthlySalaryAfterTax = monthlySalary - monthlyTax; // monthly salary after tax
            double yearlySalaryAfterTax = monthlySalaryAfterTax * 12; // yearly salary after tax
            totalSalary += yearlySalaryAfterTax; // add to total salary
            totalTax += monthlyTax * 12; // add to total tax

            System.out.printf("Month: %s, Monthly Salary: %.2f, Monthly Tax: %.2f, Monthly Salary After Tax: %.2f, Yearly Salary After Tax: %.2f%n",
                    date.getMonth(), monthlySalary, monthlyTax, monthlySalaryAfterTax, yearlySalaryAfterTax);
        }

        System.out.printf("Total Salary for the Year: %.2f, Total Tax for the Year: %.2f%n", totalSalary, totalTax);
    }
}

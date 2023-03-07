package Homejob_4;

import java.util.Scanner;

public class Credit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the monthly interest rate: ");
        double monthlyRate = scanner.nextDouble();


        System.out.println("Choose one of the following options:");
        System.out.println("1. Calculate the number of monthly payments that must be made to fully repay the loan");
        System.out.println("2. Calculate the amount of the monthly payment");
        int option = scanner.nextInt();

        if (option == 1) {

            System.out.print("Enter the amount of the monthly payment: ");
            double monthlyPayment = scanner.nextDouble();

            double balance = loanAmount;
            double numPayments = 0;
            while (balance > 0) {
                balance = balance - monthlyPayment;
                balance = balance + balance * monthlyRate;
                numPayments++;
            }

            System.out.println("Number of payments: " + numPayments);


            } else if (option == 2) {
                System.out.print("Введите количество платежей: ");
            int numPayments = scanner.nextInt();

               double monthlyPaymentAmount = loanAmount * monthlyRate /
                        (1 - Math.pow(1 + monthlyRate, -numPayments));
                System.out.println("Сумма ежемесячного платежа: " + monthlyPaymentAmount);
            } else {
                System.out.println("Некорректная опция");
            }
     }

        }










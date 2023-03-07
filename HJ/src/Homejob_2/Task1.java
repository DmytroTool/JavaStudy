package Homejob_2;

public class Task1 {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int result = (int)Math.pow(number1,number2);
        System.out.println("Your result is:" + result);

    }
}
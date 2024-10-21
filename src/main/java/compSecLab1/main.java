package compSecLab1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            double firstInput, secondInput;
            int option;
            menu();
            option = sc.nextInt();

            if (option == 0 || option > 4) {
                System.out.println("This is an invalid option, please input one of the presented options:");
            }
            switch (option) {
                case 1:
                    System.out.println("Enter first number");
                    firstInput = sc.nextDouble();
                    System.out.println("Enter second number");
                    secondInput = sc.nextDouble();
                    sum(firstInput, secondInput);
                    System.out.println("The result is: " + sum(firstInput, secondInput));
                    break;
                case 2:
                    System.out.println("Enter first number");
                    firstInput = sc.nextDouble();
                    System.out.println("Enter second number");
                    secondInput = sc.nextDouble();
                    subtract(firstInput, secondInput);
                    System.out.println("The result is: " + subtract(firstInput, secondInput));
                    break;
                case 3:
                    System.out.println("Enter first number");
                    firstInput = sc.nextDouble();
                    System.out.println("Enter second number");
                    secondInput = sc.nextDouble();
                    multiply(firstInput, secondInput);
                    System.out.println("The result is: " + multiply(firstInput, secondInput));
                    break;
                case 4:
                    System.out.println("Enter first number");
                    firstInput = sc.nextDouble();
                    System.out.println("Enter second number");
                    secondInput = sc.nextDouble();
                    divide(firstInput, secondInput);
                    System.out.println("The result is: " + divide(firstInput, secondInput));
                    break;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }


    }

    public static void menu() {
        System.out.print("Which equation would you like to do\n" +
                "1) Addition\n" +
                "2) Subtraction\n" +
                "3) Multiplication\n" +
                "4) Division\n");

    }

    public static double sum(double a, double b) {
        double result = 0;
        try {
            result = a + b;
        } catch (Exception e) {
            System.out.println("Something went wrong with the addition equation");
        }
        return result;
    }

    public static double subtract(double a, double b) {
        double result = 0;
        try {
            result = a - b;
        } catch (Exception e) {
            System.out.println("Something went wrong with the subtracting equation");
        }
        return result;
    }

    public static double multiply(double a, double b) {
        double result = 0;
        try {
            result = a * b;
        } catch (Exception e) {
            System.out.println("Something went wrong with the multiplying equation");
        }
        return result;
    }

    public static double divide(double a, double b) {
        double result = 0;
        try {
            result = a / b;
        } catch (Exception e) {
            if (a == 0 || b == 0) {
                System.out.println("No number can be divided by zero");
            } else {
                System.out.println("Something went wrong with the dividing equation");
            }
        }
        return result;
    }
}
package com.mkyong.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorService {

    public CalculatorService() {
        System.out.println("Scientific Calculator");
    }

    public double cube(int n1) {
        return n1 * n1 * n1;
    }

    public double square(int n1) {
        return n1 * n1;
    }

    public double inverse(int n1) {
        if (n1 == 0)
            return 0;
        else
            return (double) 1 / n1;
    }

    public int factorial(int number) {
        if (number < 0) {
            return -1;
        } else {
            int fact = 1;
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    //
    public double inverseCosin(double number) {
        if (number < -1)
            return 0;
        else if (number > 1)
            return 0;
        else {
            return Math.acos(number);
        }
    }

    public double cosin(double number) {
        double x = Math.toRadians(number);
        System.out.println("cos of " + number + "is " + Math.cos(x));
        return Math.cos(x);
    }

    public double sine(double number) {
        double x = Math.toRadians(number);
        System.out.println("sine of " + number + "is " + Math.sin(x));
        return Math.sin(x);
    }

    public double tangent(double number) {
        double x = Math.toRadians(number);
        System.out.println("tangent of " + number + "is " + Math.tan(x));
        return Math.tan(x);
    }

    public int combination(int n, int r) {
        if (n <= 0)
            return 0;
        else if (r <= 0)
            return 0;
        else if (n < r)
            return 0;
        else {
            int result;
            result = factorial(n) / (factorial(n - r) * factorial(r));
            return result;
        }
    }

    public double naturalLog(int number) {
        if (number <= 0)
            return 0;
        else
            return Math.log(number);
    }

    public double addition(int n1, int n2) {
        return n1 + n2;
    }

    public double subtraction(int n1, int n2) {
        return n1 - n2;
    }

    public double multiply(int n1, int n2) {
        return n1 * n2;
    }

    public double division(int n1, int n2) {
        if (n2 == 0)
            return 0;
        else
            return (double) n1 / n2;
    }

    public int modulus(int n1, int n2) {
        if (n2 <= 0)
            return 0;
        else if (n1 < n2)
            return 0;
        else
            return n1 % n2;
    }

    public String isPositive(int number) {
        boolean result = false;
        if (number >= 0) {
            result = true;
        }
        if (result)
            return "positive";
        else return "negative";
    }

    public double powerFunction(int number, int power) {
        if (power < 0)
            return 0;
        else if (number == 0)
            return 0;
        else
            return Math.pow(number, power);
    }

    public double squareRoot(int number) {
        return Math.sqrt(number);
    }

    public double negate(double number) {
        if (number < 0)
            return number;
        else
            return -1 * number;
    }

    public double incrementByOne(double num) {
        return ++num;
    }

    public double decrementByOne(double num) {
        return --num;
    }

    public String concatenate(String fname, String lname) {
        if (fname == "")
            return lname;
        else if (lname == "")
            return fname;
        else
            return fname + " " + lname;
    }

    ///Areas

    public double areaOfSquare(double num) {
        if (num <= 0)
            return 0;
        else
            return num * num;
    }

    public double areaOfRect(double a, double b) {
        if (a <= 0 || b <= 0)
            return 0;
        else
            return a * b;
    }

    public double areaOfCircle(double r) {
        if (r <= 0)
            return 0;
        else {
            int radius;
            double pi = 3.142, area;
            area = pi * r * r;
            return area;
        }
    }

    public double areaOfSphere(double r) {
        if (r <= 0)
            return 0;
        else {
            double pi = 3.142, area;
            area = 4 * pi * (r * r);
            return area;
        }
    }

    public double areaOfCylinder(double r, double h) {
        if (r <= 0 || h <= 0)
            return 0;
        else {
            double pi = 3.142, area;
            area = 2 * pi * (r * h);
            return area;
        }
    }


//    public static void main(String[] args) {
//        CalculatorService calculator = new CalculatorService();
//        Scanner scanner = new Scanner(System.in);
//        double number1 = 0, number2 = 0;
//        System.out.println("Calculator-DevOps");
//        do {
//            System.out.println("Choose to perform operation:");
//            System.out.print("Press 1 to Square Root" +
//                    "\nPress 2 to Factorial" +
//                    "\nPress 3 to Natural Logarithm" +
//                    "\nPress 4 to Power Function\n" +
//                    "\nPress 5 to Is positive\n" +
//                    "Press any other key to exit\nEnter your choice: ");
//            int choice;
//            try {
//                choice = scanner.nextInt();
//            } catch (InputMismatchException error) {
//                return;
//            }
//
//            if (choice == 4) {
//                try {
//                    System.out.print("Enter the base number : ");
//                    number1 = scanner.nextDouble();
//                    System.out.print("Enter the power : ");
//                    number2 = scanner.nextDouble();
//                } catch (InputMismatchException error) {
//                    System.out.print("Invalid input, Entered input is not a number");
//                    return;
//                }
//            } else if (choice == 1 || choice == 2 || choice == 3 || choice == 5) {
//                try {
//                    System.out.print("Enter the number : ");
//                    number1 = scanner.nextDouble();
//                } catch (InputMismatchException error) {
//                    System.out.print("Invalid input, Entered input is not a number");
//                    return;
//                }
//            } else {
//                System.out.println("Exiting....");
//                return;
//            }
//
//            switch (choice) {
//                case 1:
//                    // do Square Root
//                    System.out.println("Square Root of " + number1 + " is : " + calculator.squareRoot(number1));
//                    break;
//                case 2:
//                    // do Factorial
//                    System.out.println("Factorial of " + number1 + " is : " + calculator.factorial(number1));
//                    break;
//                case 3:
//                    // do Natural Log
//                    System.out.println("Natural Log of " + number1 + " is : " + calculator.naturalLog(number1));
//                    break;
//                case 4:
//                    // do Power Function
//                    System.out.println("Power of " + number1 + " with base " + number2 + " is : " + calculator.powerFunction(number1, number2));
//                    break;
//                case 5:
//                    // do is Positive Function
//                    System.out.println("Number " + number1 + " is : " + calculator.isPositive(number1));
//                    break;
//                default:
//                    System.out.println("Exiting....");
//                    return;
//            }
//        } while (true);
//    }

}

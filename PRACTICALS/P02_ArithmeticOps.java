package PRACTICALS;

import java.util.Scanner;

public class P02_ArithmeticOps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        double exact = (double) a / b;

        System.out.println("Sum        : " + sum);
        System.out.println("Difference : " + difference);
        System.out.println("Product    : " + product);
        System.out.println("Quotient   : " + quotient);
        System.out.println("Remainder  : " + remainder);
        System.out.println("Exact      : " + exact);

        scanner.close();
    }
}
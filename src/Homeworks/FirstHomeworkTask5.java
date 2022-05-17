package Homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FirstHomeworkTask5 {
    //Write a simple program, without checks to print the
    //result of quadratic equation.
    public static void main(String[] args) {
        System.out.println("Enter:");
        Scanner scan = new Scanner(System.in);

        double square = scan.nextDouble();
        double squareRoot = Math.sqrt(square);

        System.out.printf("The square root is: %.2f" ,squareRoot);


    }
}

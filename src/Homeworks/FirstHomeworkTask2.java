package Homeworks;

import java.util.Scanner;

public class FirstHomeworkTask2 {
    //Print the perimeter of a triangle by given sides. Use
    //formula to calculate it.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side A:");
        double sideA = scan.nextDouble();
        System.out.println("Enter side B:");
        double sideB = scan.nextDouble();
        System.out.println("Enter side C:");
        double sideC = scan.nextDouble();

        double parameter = sideA + sideB + sideC;

        System.out.printf("The perimeter is: %.2f", parameter);
    }
}

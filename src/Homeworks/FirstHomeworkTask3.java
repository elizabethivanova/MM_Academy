package Homeworks;

import java.util.Scanner;

public class FirstHomeworkTask3 {
    //Print the area of a triangle by given sides. Use
    //formula to calculate it.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base:");
        double base = scan.nextDouble();
        System.out.println("Enter the height:");
        double height = scan.nextDouble();
        double area = (base*height)/2;

        System.out.printf("The triangle area is: %.2f", area);
    }
}

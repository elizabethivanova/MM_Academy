package DataStructures;

import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers you will add?");
        int n = scan.nextInt();
        int[] numbers = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Add number " + (i + 1));
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }
        System.out.println("The sum is: " + sum);
    }
}

package Homeworks;

import java.util.Scanner;

public class FirstHomeworkTask4 {
    //Print pine tree using asterisks in the console.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter wanted rows:");
        int rows = scan.nextInt();
        int col = rows;

        for (int i = 1; i <= rows; i++) {
            System.out.println("");
            for (int j = col; j >= 1; j--) {
                System.out.print("* ");
            }
            col--;
        }

    }
}

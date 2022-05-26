package DataStructures;

import java.util.Scanner;

public class MatrixFromUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter number: ");
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}

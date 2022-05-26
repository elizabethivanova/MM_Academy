package DataStructures;

import java.util.Scanner;

public class BiggestElementOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number you will check?");
        int n = scan.nextInt();
        int[] numbers = new int[n];
        int biggestNumber = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Add number " + (i + 1));
            numbers[i] = scan.nextInt();
            if(numbers[i] > biggestNumber){
                biggestNumber = numbers[i];
            }
        }
        System.out.println("The biggest number is: " + biggestNumber);
    }
}

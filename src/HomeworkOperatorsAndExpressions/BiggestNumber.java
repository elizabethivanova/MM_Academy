package HomeworkOperatorsAndExpressions;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Колко числа ще въведете?");
        int n = scan.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        int biggestNumber = 0;
        for (int i = 0 ; i < numbers.length; i++) {
            if (numbers[i] > biggestNumber){
                biggestNumber = numbers[i];
            }
        }
        System.out.println("Най-голямото число е: " + biggestNumber);

    }
}

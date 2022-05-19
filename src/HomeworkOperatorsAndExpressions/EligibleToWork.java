package HomeworkOperatorsAndExpressions;

import java.util.Scanner;

public class EligibleToWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();

        if(age >= 16){
            System.out.println("You are eligible to work!");
        }else if(age > 0){
            System.out.println("You are not eligible to work! Relax!");
        }else{
            System.out.println("First born, then working.");
        }
    }
}

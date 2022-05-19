package HomeworkOperatorsAndExpressions;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select a destination: Beach or Mountain?");
        String destination = scan.nextLine();
        System.out.println("Select the budget per day per person:");
        double budget = scan.nextDouble();

        if(destination.equalsIgnoreCase("Beach")){
            if(budget < 50){
                System.out.println("Destination: Bulgaria");
            }else{
                System.out.println("Destination:   Outside Bulgaria");
            }
        }else if(destination.equalsIgnoreCase("Mountain")){
            if(budget < 30){
                System.out.println("Destination: Bulgaria");
            }else{
                System.out.println("Destination:   Outside Bulgaria");
            }
        }else{
            System.out.println("There is no information about this type of vacation!");
        }
    }
}

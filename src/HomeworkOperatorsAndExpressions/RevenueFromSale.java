package HomeworkOperatorsAndExpressions;

import java.util.Scanner;

public class RevenueFromSale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double discount = 0;

        System.out.println("Enter the price:");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        double totalPrice = price * quantity;
        double priceWithDiscount;


        if(quantity >= 100 && quantity <= 120){
            discount = totalPrice * 0.15;
        }else if(quantity > 120){
            discount = totalPrice * 0.20;
        }

        priceWithDiscount = totalPrice - discount;
        System.out.printf("The revenue from sale: %.2f lv.", priceWithDiscount);
        System.out.println();
        System.out.printf("Discount: %.2f lv.", discount);
    }
}

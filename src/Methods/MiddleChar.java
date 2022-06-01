package Methods;

import java.util.Scanner;

public class MiddleChar {
    //Write a Java method to display the middle character of a string.
    //Note:
    //a) If the length of the string is even there will be two middle characters.
    //b) If the length of the string is odd there will be one middle character.

    static void displayMiddleCharOdd(){

    }
    static void displayMiddleCharEven(){

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        if(text.length() % 2 == 0){
            //even
            displayMiddleCharEven();
        }else{
            //odd
            displayMiddleCharOdd();
        }
    }

}

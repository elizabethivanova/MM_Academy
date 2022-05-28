package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add a word to check if it is a palindrome: ");
        String originalWord = scan.nextLine();
        String newWord = "";
        char[] reversedWord = originalWord.toCharArray();

        for (int i = reversedWord.length - 1; i >= 0; i--) {
            newWord = newWord + reversedWord[i];
        }

        if(originalWord.equalsIgnoreCase(newWord)){
            System.out.println("The word is palindrome!");
        }else{
            System.out.println("The word is not a palindrome!");
        }
    }
}

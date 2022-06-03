package Exceptions;

import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FixThisCode {

    final static String FILE_PATH = "src/Exceptions/File";
    public static void printToFile(String text, int repeat) {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH, true);
            for (int i = 0; i < repeat; i++) {
                fileWriter.write(text + "\n");
            }
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textToAdd = "";
        int howManyTimesToPrintTheTextToFile = 0;

        try{
            System.out.println("How many time to print the text?");
            howManyTimesToPrintTheTextToFile = scanner.nextInt();
            if(howManyTimesToPrintTheTextToFile <= 0){
                System.out.println("Add real number");
            }else {
                System.out.println("Enter the text:");
                textToAdd = scanner.next();
                printToFile(textToAdd, howManyTimesToPrintTheTextToFile);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

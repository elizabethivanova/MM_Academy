package HomeworkOperatorsAndExpressions;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the side A:");
        int eagleA = scan.nextInt();
        System.out.println("Enter the side B:");
        int eagleB = scan.nextInt();
        System.out.println("Enter the side CW:");
        int eagleC = scan.nextInt();

        int result = eagleA + eagleB + eagleC;

        if (result == 180 && eagleA > 0 && eagleB > 0 && eagleC > 0) {
            if(eagleA < 90 && eagleB < 90 && eagleC < 90){
                //остроъгълен
                if(eagleA == 60 && eagleB == 60 && eagleC == 60){
                    //равностранен - 60 60 60
                    System.out.println("The triangle is acute and also equilateral.");
                }else if(eagleA != eagleB && eagleB != eagleC){
                    //разностранен - 60 70 50
                    System.out.println("The triangle is acute and also multifaceted.");
                }else if(eagleA == eagleB || eagleB == eagleC || eagleA == eagleC){
                    //равнобедрен 70 70 40
                    System.out.println("The triangle is acute and also isosceles.");
                }
            }else if(eagleA > 90 || eagleB > 90 || eagleC > 90){
                //тъпоъгълен
                if(eagleA == eagleB || eagleB == eagleC || eagleA == eagleC){
                    //равнобедрен 40 40 100
                    System.out.println("The triangle is obtuse and also isosceles.");
                }else if(eagleA != eagleB && eagleB != eagleC){
                    //разностранен 100 30 50
                    System.out.println("The triangle is obtuse and also multifaceted.");
                }
            }else if(eagleA == 90 || eagleB == 90 || eagleC == 90){
                //правоъгълен
                if(eagleA == eagleB || eagleB == eagleC || eagleA == eagleC){
                    //равнобедрен 90 45 45
                    System.out.println("The triangle is right-angled and also isosceles.");
                }else if(eagleA != eagleB && eagleB != eagleC){
                    //разностранен 90 40 50
                    System.out.println("The triangle is right-angled and also multifaceted.");
                }
            }
        } else {
                System.out.println("The triangle can't be built.");
        }
    }
}

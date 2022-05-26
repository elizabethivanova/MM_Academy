package DataStructures;

import java.util.*;

public class ExampleOne {
    public static void main(String[] args) {
        String[] carBrands = {"Audi", "BMW", "Volvo", "Mercedes"};
        int[] evenNumbers = {2, 4, 6, 8, 10};
        double[] degrees = {0, 0.5, 1, 1.5, 2, 2.5};

        System.out.println(carBrands[0]); //Audi
        System.out.println(evenNumbers[2]); //6
        System.out.println(degrees[5]); //2.5

        System.out.println(carBrands.length); //4
        System.out.println(evenNumbers.length); //5
        System.out.println(degrees.length); //6

        String[] cars = new String[3];
        cars[0] = "Volvo";
        cars[1] = "BMW";
        cars[2] = "Mercedes";

        System.out.println(cars[2]); //Mercedes

        String[] animals = {"Dog", "Cat", "Bird", "Duck", "Snake"};
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }


        ArrayList<String> motors = new ArrayList<String>();
        motors.add("BMW");
        motors.add("Honda");
        motors.add("Ferrari");
        System.out.println(motors);
        System.out.println(motors.get(0));
        System.out.println("-------------");


        Queue<String> pq = new PriorityQueue<>();
        pq.add("Test1");
        pq.add("Test2");
        pq.add("Test3");
        pq.add("Test4");
        pq.add("Test5");

        System.out.println(pq);
        System.out.println("---------");

        Stack<String> elements = new Stack<>();
        elements.push("Test1");
        elements.push("Test2");
        elements.push("Test3");
        elements.push("Test4");
        elements.push("Test5");

        System.out.println(elements);
        elements.pop();
        System.out.println(elements);
    }
}

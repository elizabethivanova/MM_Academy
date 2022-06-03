package Constructors;

public class CarDemo {
    public static void main(String[] args) {
        Car one = new Car("Mercedes", "Black", 2009, 270, true);
        Car two = new Car("BMW", "Blue", 2008, 220);
        Car three = new Car("Audi", "Red", true);
        Car four = new Car("VW", 2007, 180, false);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
    }
}

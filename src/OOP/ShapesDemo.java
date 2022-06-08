package OOP;

public class ShapesDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape

        System.out.println(s1);
//95
        System.out.println(s1.getArea());
//34,55
        System.out.println(s1.getPerimeter());
//red
        System.out.println(s1.getColor());
//false
        System.out.println(s1.isFilled());
//5.5
 System.out.println(((Circle) s1).getRadius());

        Circle c1 = (Circle)s1; // Downcast back to Circle

        System.out.println(c1);

        System.out.println(c1.getArea());
//95
        System.out.println(c1.getPerimeter());
//34,55
        System.out.println(c1.getColor());
//false
        System.out.println(c1.isFilled());
//5.5
        System.out.println(c1.getRadius());
        //Shape s2 = new Shape(); // Abstract class cannot be instanciated

        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast

        System.out.println(s3);
//2
        System.out.println(s3.getArea());
//6
        System.out.println(s3.getPerimeter());
//red
        System.out.println(s3.getColor());
//2
 System.out.println(((Rectangle) s3).getLength());
        Rectangle r1 = (Rectangle)s3; // downcast

        System.out.println(r1);
//2
        System.out.println(r1.getArea());
//red
        System.out.println(r1.getColor());
//2
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6, "red", true); // Upcast

        System.out.println(s4);
//43,56
        System.out.println(s4.getArea());
//red
        System.out.println(s4.getColor());
//6.6
 System.out.println(((Square) s4).getSide());
        // Take note that we downcast Shape s4 to Rectangle,

// which is a superclass of Square, instead of Square

        Rectangle r2 = (Rectangle)s4;

        System.out.println(r2);
//
        System.out.println(r2.getArea());

        System.out.println(r2.getColor());

 //System.out.println(r2.getSide());

        System.out.println(r2.getLength());

// Downcast Rectangle r2 to Square

        Square sq1 = (Square)r2;

        System.out.println(sq1);

        System.out.println(sq1.getArea());

        System.out.println(sq1.getColor());

        System.out.println(sq1.getSide());

        System.out.println(sq1.getLength());
    }
}

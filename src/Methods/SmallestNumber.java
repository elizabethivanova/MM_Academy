package Methods;

public class SmallestNumber {
    static void findSmallestNumber(int x, int z, int y){
        if(x < y && x < z){
            System.out.println("Smallest number is: " + x);
        }else if(y < x && y < z){
            System.out.println("Smallest number is: " + y);
        }else if(z < y && z < x){
            System.out.println("Smallest number is: " + z);
        }else if(x == y || y == z || x == z){
            System.out.println("Numbers are equals!");
        }
    }

    public static void main(String[] args) {
        findSmallestNumber(4, 2, 9);
        findSmallestNumber(9, 1, 2);
        findSmallestNumber(8, 9, 5);
        findSmallestNumber(8, 8 ,9);
    }
}

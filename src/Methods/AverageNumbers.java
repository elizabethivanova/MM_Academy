package Methods;

public class AverageNumbers {
    static double averageNumber(double x, double y, double z){
        return (x + y + z) / 3;
    }

    public static void main(String[] args) {
        double averageNum = averageNumber(7.9, 9.5, 11.5);
        System.out.printf("Average number is: %.2f " ,averageNum);
    }
}



package HomeworkOperatorsAndExpressions;

public class List {
    public static void main(String[] args) {
        int[] array = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 5 == 0){
                System.out.println(array[i]);
            }
            if(array[i] >= 150){
                break;
            }
        }
    }
}


package DataStructures;

public class MatrixOne {
    public static void main(String[] args) {
        int[][] matrix = new int[4][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        matrix[3][0] = 10;
        matrix[3][1] = 11;
        matrix[3][2] = 12;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}

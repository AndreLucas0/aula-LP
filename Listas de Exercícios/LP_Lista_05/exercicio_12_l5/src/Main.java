public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{5, 8, 9}, {9, 6, 7}, {2, 3, 4}};
        int determinant;

        determinant = (matrix[0][0] * matrix[1][1] * matrix[2][2]) + (matrix[0][1] * matrix[1][2] * matrix[2][0]) + (matrix[0][2] * matrix[1][0] * matrix[2][1])
                      - (matrix[2][0] * matrix[1][1] * matrix[0][2]) - (matrix[2][1] * matrix[1][2] * matrix[0][0]) - (matrix[2][2] * matrix[1][0] * matrix[0][1]);

        System.out.println(determinant);
    }
}
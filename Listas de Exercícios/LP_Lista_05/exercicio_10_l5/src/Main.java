public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{5, 8}, {9, 6}, {2, 3}};
        int[][] secondMatrix = {{5, 8}, {9, 6}};
        int[][] matrixResult = new int[3][2];

        for (int i=0; i<3; i++) {
            for (int j=0; j<2; j++) {
                for (int k=0; k<2; k++) {
                    matrixResult[i][j] += matrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j=0; j<2; j++) {
                System.out.print("\na "+ i + ", " + j + " = " + matrixResult[i][j] + " ");
            }
        }

    }
}
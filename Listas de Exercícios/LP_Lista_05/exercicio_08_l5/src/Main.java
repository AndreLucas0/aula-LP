public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{5, 8, 9, 7, 3}, {9, 6, 7, 7, 3}, {2, 3, 4, 7, 3}, {1, 3, 6, 8, 9}, {2, 9, 0, 1, 2}};

        for (int i=0; i<matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }

        /*for (int i=0; i<matrix.length; i++) {
            for (int j=0; j< matrix.length; j++) {
                if (i==j) {
                    System.out.println(matrix[i][j]);
                }
            }
        }*/

    }
}
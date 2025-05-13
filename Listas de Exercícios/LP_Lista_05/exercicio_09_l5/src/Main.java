public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{5, 8, 9, 7, 3}, {9, 6, 7, 7, 3}, {2, 3, 4, 7, 3}, {1, 3, 6, 8, 9}, {2, 9, 0, 1, 2}};

        for (int i=0; i< matrix.length; i++) {
            System.out.println(matrix[i][matrix.length-1-i]);
        }

        /*for (int i=0; i< matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                if ((i==4 && j==0) || (i==0 && j==4) || (i==3 && j==1) || (i==2 && j==2) || (i==1 && j==3)) {
                    System.out.println(matrix[i][j]);
                }
            }
        }*/
    }
}
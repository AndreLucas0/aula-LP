import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i1, i2, i3, i4;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows of the first matrix: ");
        i1 = in.nextInt();
        System.out.println("Enter the number of columns of the first matrix: ");
        i2 = in.nextInt();
        System.out.println("Enter the number of rows of the second matrix: ");
        i3 = in.nextInt();
        System.out.println("Enter the number of columns of the second matrix: ");
        i4 = in.nextInt();

        int[][] matrix = new int [i1][i2];
        int[][] secondMatrix = new int [i3][i4];
        int[][] matrixResult = new int[i1][i4];

        if (i2 == i3) {
            for (int i=0; i<i1; i++) {
                for (int j=0; j<i2; j++) {
                    System.out.println("Enter the value of (a " + i + ", " + j + ") of the first matrix: ");
                    matrix[i][j] = in.nextInt();
                }
            }

            for (int i=0; i<i3; i++) {
                for (int j=0; j<i4; j++) {
                    System.out.println("Enter the value of (a " + i + "," + j + ") of the second matrix: ");
                    secondMatrix[i][j] = in.nextInt();
                }
            }


            for (int i = 0; i < i1; i++) {
                for (int j = 0; j < i4; j++) {
                    for (int k = 0; k < i4; k++) {
                        matrixResult[i][j] += matrix[i][k] * secondMatrix[k][j];
                    }
                }
            }

            for (int i = 0; i < i1; i++) {
                for (int j = 0; j < i4; j++) {
                    System.out.print("\na " + i + ", " + j + " = " + matrixResult[i][j] + " ");
                }
            }
        } else {
            System.out.println("Matrix sizes are invalid for multiplication.");
        }
    }
}
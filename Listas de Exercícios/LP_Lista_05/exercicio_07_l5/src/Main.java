public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{5, 8, 9, 7, 3}, {9, 6, 7, 7, 3}, {2, 3, 4, 7, 3}, {1, 3, 6, 8, 9}, {2, 9, 0, 1, 2}};
        int maxLineCalc0 = 0, maxLineCalc1 = 0, maxLineCalc2 = 0, maxLineCalc3 = 0, maxLineCalc4 = 0;
        int maxColumnCalc0 = 0, maxColumnCalc1 = 0, maxColumnCalc2 = 0, maxColumnCalc3 = 0, maxColumnCalc4 = 0;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i == 0) {
                    maxLineCalc0 += matriz[i][j];
                } else if (i == 1) {
                    maxLineCalc1 += matriz[i][j];
                } else if (i == 2) {
                    maxLineCalc2 += matriz[i][j];
                } else if (i == 3) {
                    maxLineCalc3 += matriz[i][j];
                } else {
                    maxLineCalc4 += matriz[i][j];
                }
            }
        }

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i == 0) {
                    maxColumnCalc0 += matriz[j][i];
                } else if (i == 1) {
                    maxColumnCalc1 += matriz[j][i];
                } else if (i == 2) {
                    maxColumnCalc2 += matriz[j][i];
                } else if (i == 3) {
                    maxColumnCalc3 += matriz[j][i];
                } else {
                    maxColumnCalc4 += matriz[j][i];
                }
            }
        }

        if (maxLineCalc0>=maxLineCalc1 && maxLineCalc0>=maxLineCalc2 && maxLineCalc0>=maxLineCalc3 && maxLineCalc0>=maxLineCalc4) {
            System.out.println("The largest sum of lines is: " + maxLineCalc0);
        } else if (maxLineCalc1>=maxLineCalc0 && maxLineCalc1>=maxLineCalc2 && maxLineCalc1>=maxLineCalc3 && maxLineCalc1>=maxLineCalc4) {
            System.out.println("The largest sum of lines is: " + maxLineCalc1);
        } else if (maxLineCalc2>=maxLineCalc0 && maxLineCalc2>=maxLineCalc1 && maxLineCalc2>=maxLineCalc3 && maxLineCalc2>=maxLineCalc4) {
            System.out.println("The largest sum of lines is: " + maxLineCalc2);
        } else if (maxLineCalc3>=maxLineCalc0 && maxLineCalc3>=maxLineCalc1 && maxLineCalc3>=maxLineCalc2 && maxLineCalc3>=maxLineCalc4) {
            System.out.println("The largest sum of lines is: " + maxLineCalc3);
        } else {
            System.out.println("The largest sum of lines is: " + maxLineCalc4);
        }

        if (maxColumnCalc0>=maxColumnCalc1 && maxColumnCalc0>=maxColumnCalc2 && maxColumnCalc0>=maxColumnCalc3 && maxColumnCalc0>=maxColumnCalc4) {
            System.out.println("The largest sum of columns is: " + maxLineCalc0);
        } else if (maxColumnCalc1>=maxColumnCalc0 && maxColumnCalc1>=maxColumnCalc2 && maxColumnCalc1>=maxColumnCalc3 && maxColumnCalc1>=maxColumnCalc4) {
            System.out.println("The largest sum of columns is: " + maxLineCalc1);
        } else if (maxColumnCalc2>=maxColumnCalc0 && maxColumnCalc2>=maxColumnCalc1 && maxColumnCalc2>=maxColumnCalc3 && maxColumnCalc2>=maxColumnCalc4) {
            System.out.println("The largest sum of columns is: " + maxLineCalc2);
        } else if (maxColumnCalc3>=maxColumnCalc0 && maxColumnCalc3>=maxColumnCalc1 && maxColumnCalc3>=maxColumnCalc2 && maxColumnCalc3>=maxColumnCalc4) {
            System.out.println("The largest sum of columns is: " + maxLineCalc3);
        } else {
            System.out.println("The largest sum of columns is: " + maxLineCalc4);
        }
    }
}

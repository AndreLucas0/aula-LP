import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner in = new Scanner(System.in);
        System.out.println("Insira um número para realizar a busca: ");
        number = in.nextInt();

        System.out.println(binarySearch(number, array.length/2, array.length-1, array));
    }

    public static boolean binarySearch(int x, int mid, int end, int[] array) {

        if (x == array[mid]) {
            return true;
        }

        if (x > array[mid]) {
            mid = end/2;
        }

        if (x < array[mid]) {
            mid /= 2;
        }

        return binarySearch(x, mid, end, array);
    }
}
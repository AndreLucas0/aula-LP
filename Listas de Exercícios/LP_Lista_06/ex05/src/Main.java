import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner in = new Scanner(System.in);
        System.out.println("Insira um número para realizar a busca: ");
        number = in.nextInt();

        result = binarySearch(number, 0, array.length-1, array);

        if (result == -1) {
            System.out.println("O número " + number + " não foi encontrado neste array!");
        } else {
            System.out.println("O número " + number + " foi encontrado no índice " + result + " deste array.");
        }
    }

    public static int binarySearch(int x, int start, int end, int[] array) {
        int mid;

        mid = (start+end)/2;

        if (x == array[mid]) {
            return mid;
        }

        if (x > array[mid]) {
            start = mid + 1;
        }

        if (x < array[mid]) {
            end = mid - 1;
        }

        if (start > end) {
            return -1;
        }

        return binarySearch(x, start, end, array);
    }
}
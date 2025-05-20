import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira um número: ");
        n = in.nextInt();

        result = multNumbers(n);
        System.out.println("O valor total da soma é: " + result);
    }

    public static int multNumbers(int x) {
        if (x == 1)
            return 1;
        return x * multNumbers(x-1);
    }
}
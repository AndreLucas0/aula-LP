import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, result;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Insira um número maior que zero: ");
            n = in.nextInt();
        } while (n <= 0);


        result = multNumbers(n);
        System.out.println("O valor total do fatorial do número é: " + result);
    }

    public static int multNumbers(int x) {
        if (x == 1)
            return 1;
        return x * multNumbers(x-1);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira um número: ");
        n = in.nextInt();

        result = sumNumbers(n);
        System.out.println("O valor total da soma é: " + result);
    }

    public static int sumNumbers(int x) {
        if(x==1)
            return 1;
        return x + sumNumbers(x-1);

        /*ou

        int sum = 0;

        if (!(x > 0)) {System.out.println("Valor inválido, por favor insira um valor maior que zero!");}

        for (int i=x; i>0; i--) {sum += i;}

        return sum;*/
    }
}
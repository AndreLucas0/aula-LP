import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o valor do coeficiente a: ");
        a = in.nextDouble();

        System.out.println("Escreva o valor do coeficiente b: ");
        b = in.nextDouble();

        result = -b / a;
        System.out.println("O valor de x é: " + result);

    }
}
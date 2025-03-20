import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double b, a, result;

        System.out.println("Escreva o valor da base do triângulo: ");
        System.out.println("Escreva o valor da altura do triângulo: ");

        Scanner in = new Scanner(System.in);
        b = in.nextDouble();
        a = in.nextDouble();

        result = (b*a)/2;
        System.out.println("O valor da área do triângulo é: " + result);
    }
}
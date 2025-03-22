import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double b, c, xOne, xTwo;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o valor de x1: ");
        xOne = in.nextDouble();

        System.out.println("Escreva o valor de x2: ");
        xTwo = in.nextDouble();

        b = -xTwo-xOne;
        c = -xOne*-xTwo;
        System.out.println("A equação quadrática é: x² + " + b + "x + " + c );
    }
}
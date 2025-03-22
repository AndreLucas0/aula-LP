import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double a, b, c, delta, xOne, xTwo;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o valor do coeficiente a: ");
        a = in.nextDouble();

        System.out.println("Escreva o valor do coeficiente b: ");
        b = in.nextDouble();

        System.out.println("Escreva o valor do coeficiente c: ");
        c = in.nextDouble();

        delta = (b*b) - 4*a*c;
        xOne = (-b + Math.pow(delta, 0.5))/2*a;
        xTwo = (-b - Math.pow(delta, 0.5))/2*a;

        System.out.println("O valor do x1 é de: " + xOne);
        System.out.println("O valor do x2 é de: " + xTwo);
        System.out.println("S = {" + xOne + ", " + xTwo + "}");

    }
}
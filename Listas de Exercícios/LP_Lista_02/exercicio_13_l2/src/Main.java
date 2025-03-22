import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, A;

        System.out.println("Escreva o raio do círculo: ");

        Scanner in = new Scanner(System.in);
        r = in.nextDouble();

        A = Math.pow(r, 2)*Math.PI;
        System.out.println("A área do círculo é: " + A);
    }
}
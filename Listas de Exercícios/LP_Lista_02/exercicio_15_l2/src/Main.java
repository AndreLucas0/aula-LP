import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, h, result;

        System.out.println("Escreva o valor do raio do cilindro em m: ");
        System.out.println("Escreva o valor da altura do cilindro em m: ");

        Scanner in = new Scanner(System.in);
        r = in.nextDouble();
        h = in.nextDouble();

        result = (r*r) * 3.14 * h;

        System.out.println("O valor do volume do cilindro é de: " + result + " m³");
    }
}
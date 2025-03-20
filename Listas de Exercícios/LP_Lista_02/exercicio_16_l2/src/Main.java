import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, h, result;

        System.out.println("Escreva o valor do raio do cone em m: ");
        System.out.println("Escreva o valor da altura do cone em m: ");

        Scanner in = new Scanner(System.in);
        r = in.nextDouble();
        h = in.nextDouble();

        result = (r*r) * 3.14 * h * ((double) 1 /3);

        System.out.println("O valor do volume do cone é de: " + result + " m³");
    }
}
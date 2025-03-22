import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double v, t, a, result, space;

        System.out.println("Escreva a velocidade inicial em m/s: ");
        System.out.println("Escreva o tempo do percurso em s: ");
        System.out.println("Escreva a aceleração do corpo em m/s²: ");

        Scanner in = new Scanner(System.in);

        v = in.nextDouble();
        t = in.nextDouble();
        a = in.nextDouble();

        space = v * t + a * ((t*t)/2);
        result = space/t;

        System.out.println("A velocidade média do corpo acelerado é de: " + result + "m/s");
    }
}
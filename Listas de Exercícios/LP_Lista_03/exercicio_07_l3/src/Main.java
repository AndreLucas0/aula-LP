import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o valor dos coeficientes A, B e C separados por espaço: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        delta = Math.pow(b, 2)-4*a*c;
        System.out.println("O valor de delta é: " + delta);
        System.out.println("-------------------------------------");
        if (delta<0){
            System.out.println("As raízes não pertencem ao conjunto dos números Reais.");
        } else {
            x1 = (b + Math.sqrt(delta)) / (2 * a);
            x2 = (b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
    }
}
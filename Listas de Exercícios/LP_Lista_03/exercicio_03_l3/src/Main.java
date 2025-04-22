import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira as notas separadas por espaço: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        result = (n1+n2)/2;

        if (result<50) {
            System.out.println("Sua média foi: " + result);
            System.out.println("Reprovado.");
        } else {
            System.out.println("Sua média foi: " + result);
            System.out.println("Aprovado.");
        }
    }
}
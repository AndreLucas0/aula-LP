import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira dois números separados por espaço: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        if (n1>n2) {
            System.out.println("O maior número é o: " + n1);
        } else {
            System.out.println("O maior número é o: " + n2);
        }
    }
}
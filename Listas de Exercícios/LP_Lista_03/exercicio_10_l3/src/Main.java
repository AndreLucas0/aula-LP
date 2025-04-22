import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, n3;

        Scanner in = new Scanner(System.in);
        System.out.println("Escreva três números separados por espaço: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        n3 = in.nextDouble();

        if (n1>n2 && n1>n3 && n2>n3) {
            System.out.println("Os números em ordem crescente são: " + n3 + " " + n2 + " " + n1);
        } else if (n2>n1 && n2>n3 && n1>n3) {
            System.out.println("Os números em ordem crescente são: " + n3 + " " + n1 + " " + n2);
        } else if (n3>n1 && n3>n2 && n1>n2) {
            System.out.println("Os números em ordem crescente são: " + n2 + " " + n1 + " " + n3);
        } else if (n1>n2 && n1>n3 && n3>n2) {
            System.out.println("Os números em ordem crescente são: " + n2 + " " + n3 + " " + n1);
        } else if (n2>n1 && n2>n3 && n3>n1) {
            System.out.println("Os números em ordem crescente são: " + n1 + " " + n3 + " " + n2);
        } else if (n3>n1 && n3>n2 && n2>n1) {
            System.out.println("Os números em ordem crescente são: " + n1 + " " + n2 + " " + n3);
        }
    }
}
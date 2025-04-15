import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, n3, n4, n5, max, min;
        max = 0;
        min = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva os 5 números separados por espaço: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        n3 = in.nextDouble();
        n4 = in.nextDouble();
        n5 = in.nextDouble();

        for(double i=0; i<=max; i++) {
            if (n1>i) {
                max = n1;
            }
            if (n2>i) {
                max = n2;
            }
            if (n3>i) {
                max = n3;
            }
            if (n4>i) {
                max = n4;
            }
            if (n5>i) {
                max = n5;
            }
        }

        for(double i = max; i>=min; i--) {
            if (n1<i) {
                min = n1;
            }
            if (n2<i) {
                min = n2;
            }
            if (n3<i) {
                min = n3;
            }
            if (n4<i) {
                min = n4;
            }
            if (n5<i) {
                min = n5;
            }
        }

        System.out.println("O maior número é: " + max);
        System.out.println("O menor número é: " + min);
    }
}
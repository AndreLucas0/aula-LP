import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, n3, result, result2;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira as notas separadas por espaço: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        result = (n1+n2)/2;

        if (result<50) {
            System.out.println("Sua média foi: " + result);
            System.out.println("Insira a nota da recuperação: ");
            n3 = in.nextDouble();

            result2 = (result+n3)/2;
            if (result2<50) {
                System.out.println("Sua nova média foi: " + result2);
                System.out.println("Reprovado.");
            } else {
                System.out.println("Sua nova média foi: " + result2);
                System.out.println("Aprovado.");
            }
        } else {
            System.out.println("Sua média foi: " + result);
            System.out.println("Aprovado.");
        }
    }
}
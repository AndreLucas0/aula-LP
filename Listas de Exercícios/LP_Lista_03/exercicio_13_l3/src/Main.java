import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        double n1, n2, a, p;

        Scanner in = new Scanner(System.in);

        System.out.println("Menu:\n" +
                "           1. Círculo\n" +
                "           2. Triângulo retângulo\n" +
                "           3. Retângulo\n" +
                "------------------------------");
        System.out.println("Escolha uma opção: ");
        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("------------------------------");
                System.out.println("Informe o raio: ");
                n1 = in.nextDouble();
                System.out.println("Informe o valor de pi que irá usar: ");
                n2 = in.nextDouble();

                a = n2*Math.pow(n1, 2);
                p = 2*n2*n1;

                System.out.println("------------------------------");
                System.out.println("Área = " + a);
                System.out.println("Perímetro = " + p);
                break;

            case 2:
                System.out.println("------------------------------");
                System.out.println("Informe a base: ");
                n1 = in.nextDouble();
                System.out.println("Informe a altura: ");
                n2 = in.nextDouble();

                a = (n1*n2)/2;
                p = n1+n2+(Math.sqrt(Math.pow(n1, 2) + Math.pow(n2, 2)));

                System.out.println("------------------------------");
                System.out.println("Área = " + a);
                System.out.println("Perímetro = " + p);
                break;

            case 3:
                System.out.println("------------------------------");
                System.out.println("Informe a base: ");
                n1 = in.nextDouble();
                System.out.println("Informe a altura: ");
                n2 = in.nextDouble();

                a = n1*n2;
                p = (n1*2) + (n2*2);

                System.out.println("------------------------------");
                System.out.println("Área = " + a);
                System.out.println("Perímetro = " + p);
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
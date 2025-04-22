import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, result;
        int option;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        n1 = in.nextDouble();
        System.out.println("Insira o segundo número: ");
        n2 = in.nextDouble();
        System.out.println("------------------------------");

        System.out.println("Menu:\n" +
                "           1. Soma\n" +
                "           2. Subtração\n" +
                "           3. Multiplicação\n" +
                "           4. Divisão\n" +
                "------------------------------");
        System.out.println("Escolha uma opção: ");
        option = in.nextInt();

        switch (option){
            case 1:
                result = n1+n2;
                System.out.println("Resultado: " + n1 + " + " + n2 + " = " + result);
                break;

            case 2:
                result = n1-n2;
                System.out.println("Resultado: " + n1 + " - " + n2 + " = " + result);
                break;

            case 3:
                result = n1*n2;
                System.out.println("Resultado: " + n1 + " x " + n2 + " = " + result);
                break;

            case 4:
                result = n1/n2;
                System.out.println("Resultado: " + n1 + " / " + n2 + " = " + result);
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
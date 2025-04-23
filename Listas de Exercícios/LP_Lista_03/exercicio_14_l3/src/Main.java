import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        double value, parcelas;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o valor da compra: ");
        value = in.nextDouble();
        System.out.println("------------------------------");

        System.out.println("Menu:\n" +
                "           1. Débito\n" +
                "           2. Pix\n" +
                "           3. Crédito\n" +
                "------------------------------");
        System.out.println("Escolha a forma de pagamento: ");
        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("------------------------------");
                System.out.println("Débito selecionado, será aplicado um desconto de 5%.");
                System.out.println("------------------------------");
                System.out.println("Valor total da compra: " + value*0.95);
                break;

            case 2:
                System.out.println("------------------------------");
                System.out.println("Pix selecionado, será aplicado um desconto de 10%.");
                System.out.println("------------------------------");
                System.out.println("Valor total da compra: " + value*0.90);
                break;

            case 3:
                System.out.println("------------------------------");
                System.out.println("Crédito selecionado.");
                System.out.println("------------------------------");
                System.out.println("Informe o número de parcelas (máximo de 10x): ");
                parcelas = in.nextDouble();
                System.out.println("------------------------------");
                if (parcelas<=4 && parcelas>0) {
                    System.out.println("Será aplicado uma taxa de 2% ao valor total.");
                    System.out.println("Valor total da compra: " + value*1.02);
                } else if (parcelas>4) {
                    System.out.println("Será aplicado uma taxa de 5% ao valor total.");
                    System.out.println("Valor total da compra: " + value*1.05);
                } else {
                    System.out.println("Quantidade de parcelas inválidas.");
                }
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
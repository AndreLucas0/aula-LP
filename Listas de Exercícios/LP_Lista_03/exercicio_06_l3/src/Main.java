import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1;

        Scanner in = new Scanner(System.in);
        System.out.println("Escolha uma opção entre 5 e 9: ");
        n1 = in.nextInt();

        if (n1>5 && n1<9) {
            System.out.println("Opção válida.");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
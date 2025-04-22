import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);
        System.out.println("Escreva um número de 1 a 7: ");
        number = in.nextInt();

        if (number==1) {
            System.out.println("O dia da semana correspondente é domingo.");
        } else if (number==2) {
            System.out.println("O dia da semana correspondente é segunda-feira");
        } else if (number==3) {
            System.out.println("O dia da semana correspondente é terça-feira.");
        } else if (number==4) {
            System.out.println("O dia da semana correspondente é quarta-feira.");
        } else if (number==5) {
            System.out.println("O dia da semana correspondente é quinta-feira.");
        } else if (number==6) {
            System.out.println("O dia da semana correspondente é sexta-feira.");
        } else if (number==7) {
            System.out.println("O dia da semana correspondente é sábado.");
        } else {
            System.out.println("Número inválido.");
        }
    }
}
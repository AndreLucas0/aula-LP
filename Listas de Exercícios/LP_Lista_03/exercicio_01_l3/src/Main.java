import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o número aqui: ");
        number = in.nextDouble();

        if (number > 0) {
            result = Math.sqrt(number);
            System.out.println("A raíz quadrada do número é: " + result);
        } else {
            System.out.println("Número inválido.");
        }
        }
    }

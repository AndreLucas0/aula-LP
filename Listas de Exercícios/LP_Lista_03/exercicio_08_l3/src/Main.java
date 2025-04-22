import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o número: ");
        number = in.nextInt();

        if (number%2!=0){
            System.out.println("O número é ímpar.");
        } else {
            System.out.println("O número é par.");
        }
    }
}
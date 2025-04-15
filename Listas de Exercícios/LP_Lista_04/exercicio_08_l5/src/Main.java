import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, verification, verificationtwo;
        verificationtwo = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o número: ");
        number = in.nextInt();

        verification = (int) (Math.sqrt(number)+1);

        for (int i=2; i<=verification; i++){
            if (number%i == 0){
                verificationtwo = 1;
            }
        }

        if (verificationtwo==1) {
            System.out.println("O " + number + " não é primo");
        } else {
            System.out.println("O " + number + " é primo");
        }
    }
}
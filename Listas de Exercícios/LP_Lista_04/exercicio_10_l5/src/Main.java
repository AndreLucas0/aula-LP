import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, term;

        Scanner in = new Scanner(System.in);
        System.out.println("Escreva a quantidade de termos da sequência de Fibonacci: ");
        n1 = in.nextInt();

        for (int i = 0; i <=n1 ; i++) {
            if (i==0){
                System.out.print("0 ");
            } else if (i==1) {
                System.out.print("1 ");
            } else if (i>1) {
                term = (1/Math.sqrt(5)) * (Math.pow(((1+Math.sqrt(5))/2), i) - Math.pow(((1-Math.sqrt(5))/2), i));
                System.out.printf("%.0f", term);
                System.out.print(" ");
            }
        }
    }
}
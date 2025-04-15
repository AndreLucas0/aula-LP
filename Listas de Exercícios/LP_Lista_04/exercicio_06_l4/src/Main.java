import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva os 2 números separados por espaço: ");
        n1 = in.nextInt();
        n2 = in.nextInt();

        if (n1>n2){
            for(int i=n2; i<=n1; i++) {
                System.out.println(i);
            }
        }else {
            for(int i = n1; i <= n2; i++) {
                System.out.println(i);
            }
        }

    }
}
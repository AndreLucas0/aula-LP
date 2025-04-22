import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira as notas separadas por espaço: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        result = (n1+n2)/2;

        if (result<5){
            System.out.println("D");
        } else if (result<7) {
            System.out.println("C");
        } else if (result<8.5) {
            System.out.println("B");
        } else if (result<=10) {
            System.out.println("A");
        }
    }
}
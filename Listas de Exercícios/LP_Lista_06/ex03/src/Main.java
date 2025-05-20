import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base, power, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira a base da exponenciação: ");
        base = in.nextInt();
        System.out.println("Insira a potência da exponenciação: ");
        power = in.nextInt();

        result = numberPow(base, power);
        System.out.println("A potência do número é: " + result);
    }

    public static int numberPow(int x, int y) {
        if (y == 1)
            return x;
        return x * numberPow(x, y-1);

        /*int base = x;

        if (!(y>0)) {System.out.println("Insira uma potência maior que zero!");}

        for (int i=y-1; i>0; i--) {x *= base;}

        return x;*/
    }

}
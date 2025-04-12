import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Write the value of the coefficient a: ");
        a = in.nextDouble();

        System.out.println("Write the value fo the coefficient b: ");
        b = in.nextDouble();

        result = -b / a;
        System.out.println("The value of the x is: " + result);

    }
}
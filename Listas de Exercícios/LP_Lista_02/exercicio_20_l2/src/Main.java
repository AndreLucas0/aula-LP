import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double b, c, xOne, xTwo;

        Scanner in = new Scanner(System.in);

        System.out.println("Write the value of the x1: ");
        xOne = in.nextDouble();

        System.out.println("Write the value of the x2: ");
        xTwo = in.nextDouble();

        b = -xTwo-xOne;
        c = -xOne*-xTwo;
        System.out.println("The quadratic equation is: x² + " + b + "x + " + c );
    }
}
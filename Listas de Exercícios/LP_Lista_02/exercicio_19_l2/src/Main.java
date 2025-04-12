import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double a, b, c, delta, xOne, xTwo;

        Scanner in = new Scanner(System.in);

        System.out.println("Write the values of the coefficients a, b and c separated by spaces: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        delta = (b*b) - 4*a*c;
        xOne = (-b + Math.pow(delta, 0.5))/2*a;
        xTwo = (-b - Math.pow(delta, 0.5))/2*a;

        System.out.println("The value of the x1 is: " + xOne);
        System.out.println("The value of the x2 is: " + xTwo);
        System.out.println("S = {" + xOne + ", " + xTwo + "}");

    }
}
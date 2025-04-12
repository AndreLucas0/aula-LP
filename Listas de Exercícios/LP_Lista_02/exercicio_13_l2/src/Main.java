import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, A;

        System.out.println("Write the radius of the circle in m: ");

        Scanner in = new Scanner(System.in);
        r = in.nextDouble();

        A = Math.pow(r, 2)*Math.PI;
        System.out.println("The area of the circle is: " + A + "m²");
    }
}
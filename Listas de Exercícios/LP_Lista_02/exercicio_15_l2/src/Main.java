import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, h, result;

        System.out.println("Write the value of the radius of the cylinder in m: ");
        System.out.println("Write the value of the height of the cylinder in m: ");

        Scanner in = new Scanner(System.in);
        r = in.nextDouble();
        h = in.nextDouble();

        result = (r*r) * 3.14 * h;

        System.out.println("The value of the volume of the cylinder is: " + result + " m³");
    }
}
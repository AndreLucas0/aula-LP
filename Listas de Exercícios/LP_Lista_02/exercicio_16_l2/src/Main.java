import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, h, result;

        System.out.println("Write the value of the radius of the cone in m: ");
        System.out.println("Write the value of the height of the cone in m: ");

        Scanner in = new Scanner(System.in);
        r = in.nextDouble();
        h = in.nextDouble();

        result = (r*r) * 3.14 * h * ((double) 1 /3);

        System.out.println("The value of the volume of the cone is: " + result + " m³");
    }
}
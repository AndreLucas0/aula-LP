import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double b, a, result;

        System.out.println("Write the value of the base of the triangle in m: ");
        System.out.println("Write the value of the height of the triangle in m: ");

        Scanner in = new Scanner(System.in);
        b = in.nextDouble();
        a = in.nextDouble();

        result = (b*a)/2;
        System.out.println("The value of the area of the triangle is: " + result + "m²");
    }
}
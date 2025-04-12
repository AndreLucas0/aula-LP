import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double v, t, a, result, space;

        System.out.println("Write the initial speed in m/s: ");
        System.out.println("Write the travel time in s: ");
        System.out.println("Write the body acceleration in m/s²: ");

        Scanner in = new Scanner(System.in);

        v = in.nextDouble();
        t = in.nextDouble();
        a = in.nextDouble();

        space = v * t + a * ((t*t)/2);
        result = space/t;

        System.out.println("the average speed of the accelerated body is: " + result + "m/s");
    }
}
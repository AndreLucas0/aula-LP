import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double speed, result;

        System.out.println("Write the speed in m/s: ");

        Scanner in = new Scanner(System.in);
        speed = in.nextDouble();

        result = speed*3.6;
        System.out.println("The speed in km/h is: " + result);
    }
}
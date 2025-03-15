import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double speed, result;

        System.out.println("Write the speed in km/h: ");

        Scanner in = new Scanner(System.in);
        speed = in.nextDouble();

        result = speed/3.6;
        System.out.println("The speed in m/s is: " + result);
    }
}
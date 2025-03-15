import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double measure, result;

        System.out.println("Write the measurement in inches: ");

        Scanner in = new Scanner(System.in);
        measure = in.nextDouble();

        result = measure * 25.4;
        System.out.println("The measurement in millimeters is: " + result);
    }
}
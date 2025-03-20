import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double temp, result;

        System.out.println("Write the temperature in Celsius: ");

        Scanner in = new Scanner(System.in);
        temp = in.nextDouble();

        result = (temp * 1.8) + 32;
        System.out.println("The temperature in Fahrenheit is: " + result);
    }
}
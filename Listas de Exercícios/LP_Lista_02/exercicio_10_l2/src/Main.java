import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distance, result;

        System.out.println("Write the distance in miles: ");

        Scanner in = new Scanner(System.in);
        distance = in.nextDouble();

        result = distance * 1.609;
        System.out.println("The distance in km is: " + result);
    }
}
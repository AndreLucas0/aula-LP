import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;

        System.out.println("Write a number: ");

        Scanner in = new Scanner(System.in);
        number = in.nextDouble();

        result = number/5;
        System.out.println("The fifth part of " + number + " is: " + result);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;

        System.out.println("Write a number: ");

        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        result = number*number;
        System.out.println("The square of " + number + " is: " + result );
    }
}
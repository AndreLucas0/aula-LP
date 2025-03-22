import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float N1, N2, result;

        System.out.println("Write your first score (0-10): ");
        System.out.println("Write your second score (0-10): ");

        Scanner in = new Scanner(System.in);
        N1 = in.nextFloat();
        N2 = in.nextFloat();

        result = (N1 + (N2*2))/3;
        System.out.println("The average of " + N1 + " and " + N2 + " is: " + result);
    }
}
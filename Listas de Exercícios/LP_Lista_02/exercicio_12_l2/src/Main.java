import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float N1, N2, result;

        System.out.println("Write your first score: ");
        System.out.println("Write your second score: ");

        Scanner in = new Scanner(System.in);
        N1 = in.nextFloat();
        N2 = in.nextFloat();

        result = (N1 + (N2*2))/3;
        System.out.println("The average of " + N1 + " and " + N2 + " is: " + result);
    }
}
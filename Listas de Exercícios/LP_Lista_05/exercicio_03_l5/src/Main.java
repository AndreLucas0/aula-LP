import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {0, 1, 2, 3 ,4 ,5 ,6 ,7 ,8, 9};
        int input;
        boolean found = false;

        Scanner in = new Scanner(System.in);
        System.out.println("Write the number you want to find: ");
        input = in.nextInt();

        for (int i=0; i<10; i++) {
            if (numbers[i] == input) {
                System.out.println("The value " + input + " was found in the position " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The value wasn't found in this array.");
        }
    }
}
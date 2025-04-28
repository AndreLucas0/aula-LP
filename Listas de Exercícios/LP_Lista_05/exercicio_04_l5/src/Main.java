import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[10];
        int positionMin = 0, positionMax = 0;

        Scanner in = new Scanner(System.in);
        
        for (int i=0; i<10; i++) {
            System.out.println("Enter value for position " + i + ":");
            numbers[i] = in.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i=0; i<10; i++) {
            if (numbers[i] >= max) {
                max = numbers[i];
                positionMax = i;
            } else if (numbers[i] <= min) {
                min = numbers[i];
                positionMin = i;
            }
        }

        System.out.println("The largest number is " + max + " at position " + positionMax);
        System.out.println("The smallest number is " + min + " at position " + positionMin);
    }
}
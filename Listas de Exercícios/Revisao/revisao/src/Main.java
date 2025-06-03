public class Main {
    public static void main(String[] args) {
        int n = 3;

        if (isEven(n))
            System.out.println("Par.");
        else
            System.out.println("ímpar.");
    }

    public static boolean isEven(int n) {
        return n%2==0;
    }
}
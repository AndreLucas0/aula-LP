public class Main {
    public static void main(String[] args) {
        int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("Inverted array v1 = {");
        for (int i = 9; i>=0; i--) {
            System.out.print(v1[i] + ", ");
        }
        System.out.print("}");
    }
}
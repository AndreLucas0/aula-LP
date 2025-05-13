public class Main {
    public static void main(String[] args) {
        int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int aux;

        System.out.print("Inverted array v1 = {");
        for (int i = 0; i<v1.length/2; i++) {
            aux = v1[v1.length-1-i];
            v1[v1.length-1-i] = v1[i];
            v1[i] = aux;
        }

        for (int valor : v1) { //ForEach
            System.out.print(valor + ", ");
        }
        System.out.print("}");
    }
}
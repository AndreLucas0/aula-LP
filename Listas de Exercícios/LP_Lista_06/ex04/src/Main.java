import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Escreva uma palavra: ");
            word = in.next();
        } while (word.isEmpty());

        String lowerCase = word.toLowerCase();

        char[] array = lowerCase.toCharArray();

        if (verificarPalindromo(array, 0, array.length-1)) {
            System.out.println(word + " é um palíndromo.");
        } else {
            System.out.println(word + " não é um palíndromo.");
        }



    }

    public static boolean verificarPalindromo(char[] str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str[start] != str[end]) {
            return false;
        }

        return verificarPalindromo(str, start+1, end-1);
    }

}
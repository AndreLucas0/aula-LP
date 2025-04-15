import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Declaração sem inicialização
        int [][] numbers = new int[2][2];

        // Declaração com inicialização
        int [][] matriz = {{5,8,9},
                           {9,6,7},
                           {2,3,4}};

        System.out.println(Arrays.deepToString(matriz));

        System.out.println("------------------------------------------");

        for (int i=0; i<matriz.length; i++) {
            for (int j = 0; j<matriz[1].length; j++) { // matriz[1].length traz a quantidade de colunas enquanto matriz.length traz a quantidade de linhas
                System.out.print(matriz[i][j] + " "); // o print sem o "ln" não pula linha
            }
            System.out.print("\n");
        }

        System.out.println("------------------------------------------");

        // foreach
        for (int [] linha:matriz){
            for (int valor:linha){
                System.out.print(valor + " ");
            }
            System.out.print("\n");
        }
    }
}
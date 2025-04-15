public class Main {
    public static void main(String[] args) {
        int [] numbers = {0,6,5,2,1};

        // percorrer vetor com for
        for (int i=0; i<5; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("---------------------------------------");

        // percorrer vetor com array.length
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("---------------------------------------");

        // foreach
        for (int pointer:numbers){ // boa prática seria chamar o "pointer" de "number" que seria o nome da outra variável no singular
            System.out.println(pointer);
        }
    }
}
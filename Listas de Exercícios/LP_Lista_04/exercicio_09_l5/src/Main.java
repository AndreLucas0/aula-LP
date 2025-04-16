import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int response;
        String response2 = "jogarnovamente", response3;

        loop: //break com label
        for (int i = 0; i <=10; i++) {
            for (int j = 0; j <= 10; j++) {
                Scanner in = new Scanner(System.in);
                System.out.println(i + " x " + j + " = ");
                response = in.nextInt();

                if (response!=i*j){
                    System.out.println("--------------------------------------");
                    System.out.println("Você errou! infelizmente não foi dessa vez...");
                    System.out.println("Gostaria de jogar novamente?");
                    System.out.println("Se sim, digite jogarnovamente");
                    response3 = in.next();

                    if (response3.equals(response2)) {
                        System.out.println("--------------------------------------");
                        System.out.println("Muito bem, vamos recomeçar então!");
                        i = 0;
                        j = -1;
                    } else {
                        System.out.println("Que pena! até uma próxima vez!");
                        break loop;
                    }
                }
                System.out.println("--------------------------------------");
            }
        }
    }
}
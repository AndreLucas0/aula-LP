import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite os três lados do triângulo separados por espaço: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (a<(b+c) && a>Math.abs(b-c) && b<(a+c) && b>Math.abs(a-c) && c<(b+a) && c>Math.abs(a-b)){ //math.abs para desprezar o sinal
            System.out.println("a, b e c formam um triângulo");
            if (a==b && a==c){
                System.out.println("Triângulo equilátero");
            }
            else if (a==b || b==c || a==c){
                System.out.println("Triângulo isósceles");
            }else{
                System.out.println("Triângulo escaleno");
            }
        }else{
            System.out.println("a, b e c não formam um triângulo");
        }
    }
}
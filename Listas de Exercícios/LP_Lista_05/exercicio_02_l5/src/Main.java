public class Main {
    public static void main(String[] args) {
        int [] numbers = {0, 1, 2, 3 ,4 ,5 ,6 ,7 ,8, 9};

        for (int i=0; i<10; i++) {
            if (numbers[i]%2 == 0 ) {
                System.out.println(numbers[i]+2);
            } else {
                System.out.println(numbers[i]*2);
            }
        }

    }
}
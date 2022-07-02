import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int fact = 1;
        int k = 1;
        while (fact > input) {
            for (int i = k; i >= 1; i--) {
                fact  = i*i-1;

            }
            k++;
        }
        System.out.println(fact);
    }
}
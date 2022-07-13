import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        long fact = 1;
        long count = 2;
        while (fact <= input) {
            fact *= count++;
        }
        System.out.println(count - 1);
    }
}
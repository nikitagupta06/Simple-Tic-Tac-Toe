import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int c1 = 0;
        if (a % n == 0) {
            c1 += 1;
        }
        System.out.println((b / n - a / n) + c1);
    }
}

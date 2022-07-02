import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean result = false;
        if (a >= b && a <= c || a >= c && a <= b) {
            result = true;
        }
        System.out.println(result);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String res = "NO";
        if (a + b > c && a + c > b && b + c > a) {
            res = "YES";
        }
        System.out.println(res);
    }
}

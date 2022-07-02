import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String out = "NO";
        if (k <= m * n && (k % n == 0 || k % m == 0)) {
            out = "YES";
        }
        System.out.println(out);

    }
}

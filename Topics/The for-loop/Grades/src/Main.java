import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            char ch = scanner.next().charAt(0);
            if (ch == 'D') {
                d += 1;
            } else if (ch == 'C') {
                c += 1;
            } else if (ch == 'B') {
                b += 1;
            } else if (ch == 'A') {
                a += 1;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        String res = "NO";
        if (num > 0) {
            res = "YES";
        }
        System.out.println(res);
    }
}

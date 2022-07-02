import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        String res = "False";
        if(-15 < num && num <= 12 || 14 < num && num < 17 || 19 <= num) {
            res = "True";
        }
        System.out.println(res);
    }
}

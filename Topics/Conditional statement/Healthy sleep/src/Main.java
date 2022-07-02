import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        String sleep = "Normal";
        if (a > h) {
            sleep = "Deficiency";
        } else if (b < h) {
            sleep = "Excess";
        }
        System.out.println(sleep);
    }
}

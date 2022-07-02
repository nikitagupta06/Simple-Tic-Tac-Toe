import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean result = false;
        boolean res1 = a > 0 && b <= 0 && c <= 0;
        boolean res2 = a <= 0 && b > 0 && c <= 0;
        boolean res3 = a <= 0 && b <= 0 && c > 0;
        if (res1 || res2 || res3) {
            result = true;
        }
        System.out.println(result);
    }
}

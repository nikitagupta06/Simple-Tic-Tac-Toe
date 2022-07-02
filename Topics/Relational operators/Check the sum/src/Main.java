import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        boolean result = false;
        if (num1 + num2 == 20 || num2 + num3 == 20 || num1 + num3 == 20 ) {
            result = true;
        }
        System.out.println(result);
    }
}

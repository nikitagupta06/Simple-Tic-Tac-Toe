import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int num = 1;
        while (num * num <= max) {
            System.out.println(num * num);
            num++;
        }
    }
}

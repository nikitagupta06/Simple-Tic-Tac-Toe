import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        int count = val;
        for (int i = 1; i <= val; i++) {
            if (count == 0) {
                break;
            }
            for (int j = 1; j <= i; j++) {
                if (count == 0) {
                    break;
                }
                System.out.print(i + " ");
                count--;
            }
        }
    }
}

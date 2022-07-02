import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        double sum = 0.0;
        double count = 0.0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                count += 1;
            }
        }
        System.out.println(sum / count);
    }
}

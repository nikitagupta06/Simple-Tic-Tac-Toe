import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int nums = scanner.nextInt();
        while (scanner.hasNext()) {
            int val = scanner.nextInt();
            if (val % 4 == 0 && val > max) {
                max = val;
            }
        }
        System.out.println(max);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        final int num = scanner.nextInt();
        final boolean day = scanner.nextBoolean();
        boolean party = false;
        boolean con1 = day && num >= 15 && num <= 25;
        boolean con2 = !day && num >= 10 && num <= 20;
        if (con1 || con2) {
            party = true;
        }
        System.out.println(party);
    }
}

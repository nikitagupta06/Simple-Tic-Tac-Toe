import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String num = scanner.nextLine();
        int res = 5;
        if (num.charAt(0) == num.charAt(3) && num.charAt(1) == num.charAt(2)) {
            res = 1;
        }
        System.out.println(res);
    }
}

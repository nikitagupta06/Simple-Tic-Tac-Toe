import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int year = scanner.nextInt();
        String isLeap = "Regular";
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeap = "Leap";
        }
        System.out.println(isLeap);
    }
}

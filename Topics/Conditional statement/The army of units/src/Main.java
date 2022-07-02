import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int units = scanner.nextInt();
        String category = "legion";
        if (units < 1) {
            category = "no army";
        } else if (1 <= units && units <= 19) {
            category = "pack";
        } else if (20 <= units && units <= 249) {
            category = "throng";
        } else if (250 <= units && units <= 999) {
            category = "zounds";
        }   
        System.out.println(category);
    }
}

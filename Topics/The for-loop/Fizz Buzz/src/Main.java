import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String res = "";
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                res += "Fizz";
            }
            if (i % 5 == 0) {
                res += "Buzz";
            } 
            if (res.isEmpty()) {
                res = String.valueOf(i);
            }
            System.out.println(res);
            res = "";
        }
    }
}

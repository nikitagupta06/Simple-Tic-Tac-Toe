import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(word.substring(scanner.nextInt(), scanner.nextInt()+1));
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 1; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        arr[0] = scanner.nextInt();
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
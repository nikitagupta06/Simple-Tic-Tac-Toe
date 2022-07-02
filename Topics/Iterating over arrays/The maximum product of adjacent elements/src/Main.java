import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int k = 0;
        int[] arr = new int[size];
        while (scanner.hasNext() && k < size) {
            arr[k++] = scanner.nextInt();
        }
        int maxProduct = arr[0] * arr[1];
        for (int i = 1; i < size - 1; i++) {
            int product = arr[i] * arr[i + 1];
            if (product > maxProduct) {
                maxProduct = product;
            }
        }
        System.out.println(maxProduct);
    }
}

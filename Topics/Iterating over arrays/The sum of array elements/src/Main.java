import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int k = 0;
        int sum = 0;
        while (scanner.hasNext() && k < size) {
            arr[k++] = scanner.nextInt();
        }
        for (int val : arr) {
            sum += val;
        }
        System.out.println(sum);
    }
}

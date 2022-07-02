import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        System.out.println(index);
    }
}

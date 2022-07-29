import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int len = arr.length;
        int[] arr1 = new int[len];
        if (steps > len) {
            steps = steps % len;
        }
        int idx = len - steps;
        for (int i = 0; i < steps; i++) {
            arr1[i] = arr[idx++];
        }
        idx = 0;
        for (int i = steps; i < len; i++) {
            arr1[i] = arr[idx++];
        }
        System.arraycopy(arr1, 0, arr, 0, len);
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[col][row];
        int col1 = row - 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[j][col1] = scanner.nextInt();
            }
            col1--;
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];        
        boolean flag = false;
        int k = 0;
        while (scanner.hasNext() && k < size) {
            arr[k++] = scanner.nextInt();            
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == a && arr[i + 1] == b || arr[i] == b && arr[i + 1] == a) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}

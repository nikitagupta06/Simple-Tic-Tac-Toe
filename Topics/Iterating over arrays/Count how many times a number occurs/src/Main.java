import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];        
        int count = 0;
        int k = 0;
        while (scanner.hasNext() && k < size) {
            arr[k++] = scanner.nextInt();            
        }
        int val = scanner.nextInt();
        for (int i : arr) {
            if (i == val) {
                count++;
            }
        }
        System.out.println(count);
    }
}

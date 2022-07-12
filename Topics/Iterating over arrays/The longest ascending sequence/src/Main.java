import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int prev = scanner.nextInt();
        int maxCount = 1;
        int runningCount = 1;
                
        for (int i = 1; i < n; i++) {
            int temp = scanner.nextInt();
            if (prev < temp) {
                runningCount++;
            } else {
                if (maxCount < runningCount) {
                    maxCount = runningCount;
                }
                runningCount = 1;
            }
            prev = temp;
        }
        if (maxCount < runningCount) {
            maxCount = runningCount;
        }
        System.out.println(maxCount);
    }
}

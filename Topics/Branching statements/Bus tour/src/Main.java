import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        scanner.nextInt();
        int bridge = 0;
        boolean crash = false;
        while (scanner.hasNext()) {
            bridge++;
            int bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + bridge);
                crash = true;
                break;
            }            
        }
        if (!crash) {
            System.out.println("Will not crash");
        }     
    }
}

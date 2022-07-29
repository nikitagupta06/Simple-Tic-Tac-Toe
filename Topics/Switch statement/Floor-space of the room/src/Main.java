import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.next();
        switch (shape) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double i = (a + b + c) / 2;
                double result = i * (i - a) * (i - b) * (i - c);
                double re = Math.sqrt(result);
                System.out.println(re);
                break;
            case "rectangle":
                double d = scanner.nextDouble();
                double e = scanner.nextDouble();
                System.out.println(d * e);
                break;
            case "circle":
                double r = scanner.nextDouble();
                System.out.println(3.14 * r * r);
                break;
            default:
                System.out.println("There is no such shape!");
                break;
        }
    }
}

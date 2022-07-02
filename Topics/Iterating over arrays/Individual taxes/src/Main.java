import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arrIncome = new int[size];
        for (int i = 0; i < size; i++) {
            arrIncome[i] = sc.nextInt();
        }

        double maxTaxPaid = 0.0;
        int itr = 0;
        int res = 0;
        while (itr < size && sc.hasNext()) {
            int temp = sc.nextInt();
            double taxPaid =  arrIncome[itr] * temp / 100.0;
            if (maxTaxPaid < taxPaid) {
                maxTaxPaid = taxPaid;
                res = itr + 1;
            }
            itr++;

        }
        System.out.println(res);
    }
}

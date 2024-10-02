package Problem37_OverMean;

import java.util.Scanner;

public class solution37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] ratio = new double[n];
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int[] num = new int[m];
            int sum = 0;
            for (int j = 0; j < m; j++) {
                num[j] = sc.nextInt();
                sum += num[j];
            }
            sum /= m;
            int cnt = 0;
            for (int j = 0; j < m; j++) {
                if (num[j] > sum) cnt++;
            }
            ratio[i] = 100 *(double) cnt / m;
        }
        for (double e : ratio) System.out.printf("%.3f%% \n",e);
    }
}
